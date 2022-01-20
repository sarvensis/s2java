package sberJPA.service.other;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sberJPA.dao.MainDao;
import sberJPA.model.User;
import sberJPA.model.other.District;
import sberJPA.service.MainService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class DistrictServiceImpl implements MainService<District> {
    @PersistenceContext
    private EntityManager em;
    private MainDao<District> districtDao;

    public void setDistrictDao(MainDao<District> districtDao) {
        this.districtDao = districtDao;
    }

    @Override
    @Transactional
    public District add(District district) {
        return districtDao.add(district);
    }

    @Override
    @Transactional
    public void update(District district) {
        districtDao.update(district);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        districtDao.remove(id);
    }

    @Override
    @Transactional(readOnly = true)
    public District getById(Long id) {
        return districtDao.getById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<District> getAll() {
        return districtDao.getAll();
    }

    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public List<District> districtList(Long idMin) {
        return em.createQuery("SELECT d FROM district d WHERE d.id > :paramId", District.class)
                .setParameter("paramId", idMin).getResultList();
    }
}

package com.huzhongyu.service.impl;

import com.huzhongyu.dao.AgreementDao;
import com.huzhongyu.entity.Agreement;
import com.huzhongyu.service.AgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AgreementService")
public class AgreementServiceImpl implements AgreementService {

    @Autowired
    private AgreementDao agreementDao;

    @Override
    public int addAgreement(String houseId, String tenantName, String tenantPhone, String startDate, String period, String deposit, String rent) {
        return agreementDao.addAgreement(houseId, tenantName, tenantPhone, startDate, period, deposit, rent);
    }

    @Override
    public int deleteAgreementById(int id) {
        return agreementDao.deleteById(id);
    }

    @Override
    public int updateAgreement(String id, String tenantName, String tenantPhone, String startDate,
                               String period,String deposit, String rent) {
        return agreementDao.updateAgreement(id, tenantName, tenantPhone, startDate, period, deposit, rent);
    }

    @Override
    public Agreement selectById(int id) {
        return agreementDao.queryAgreementById(id);
    }

    @Override
    public int deleteAgreementByHouseId(int houseId) {
        return agreementDao.deleteByHouseId(houseId);
    }

    @Override
    public List<Agreement> queryAllByHouseId(int houseId, int start, int pageNum) {
        return agreementDao.queryListByHouseId(houseId, start, pageNum);
    }
}

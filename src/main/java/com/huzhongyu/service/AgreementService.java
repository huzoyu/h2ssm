package com.huzhongyu.service;


import com.huzhongyu.entity.Agreement;

import java.util.List;

public interface AgreementService {

    //添加合同
    public int addAgreement(String houseId, String tenantName, String tenantPhone, String startDate,
                            String period,String deposit, String rent);

    //通过合同id删除合同
    public int deleteAgreementById(int id);

    //更新合同
    public int updateAgreement(String id, String tenantName, String tenantPhone, String startDate,
                               String period,String deposit, String rent);

    //通过合同id查找合同
    public Agreement selectById(int id);

    //通过房源id删除合同
    public int deleteAgreementByHouseId(int houseId);

    //通过房源id查找所有合同
    public List<Agreement> queryAllByHouseId(int houseId,int start,int pageNum);
}

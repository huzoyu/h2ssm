package com.huzhongyu.dao;

import com.huzhongyu.entity.Agreement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgreementDao {

    /**
     * 登记入住
     * 添加合同
     */
    int addAgreement(@Param("houseId") String houseID,@Param("tenantName") String tenantName,@Param("tenantPhone") String tenantPhone,
                     @Param("startDate") String startDate,@Param("period") String period,@Param("deposit") String deposit,
                     @Param("rent") String rent);

    /**
     * 更新合同
     */
    int updateAgreement(@Param("id") String houseID,@Param("tenantName") String tenantName,@Param("tenantPhone") String tenantPhone,
                        @Param("startDate") String startDate,@Param("period") String period,@Param("deposit") String deposit,
                        @Param("rent") String rent);

    /**
     * 查询合同信息
     */
    Agreement queryAgreementById(@Param("id") int id);

    /**
     * 删除合同
     */
    int deleteById(@Param("id") int id);

    /**
     * 通过房源id删除合同
     */
    int deleteByHouseId(@Param("houseId") int houseId);

    /**
     * 通过房源id查找合同列表
     */
    List<Agreement> queryListByHouseId(@Param("houseId")int houseId, @Param("offset") int offset, @Param("limit") int limit);
}

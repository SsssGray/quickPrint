package cn.xydata.mapper;

import cn.xydata.entity.TUserWallet;
import java.util.List;

public interface TUserWalletMapper {
    int deleteByPrimaryKey(String id);

    int insert(TUserWallet record);

    TUserWallet selectByPrimaryKey(String id);

    List<TUserWallet> selectAll();

    int updateByPrimaryKey(TUserWallet record);
}
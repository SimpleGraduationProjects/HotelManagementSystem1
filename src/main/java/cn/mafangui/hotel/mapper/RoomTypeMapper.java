package cn.mafangui.hotel.mapper;

import cn.mafangui.hotel.entity.RoomType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoomTypeMapper {
    Integer getCount();
    int deleteByPrimaryKey(Integer typeId);

    int insert(RoomType record);

    int insertSelective(RoomType record);

    RoomType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(RoomType record);

    int updateByPrimaryKey(RoomType record);

    List<RoomType> selectAll(@Param("searchData") String searchData);

    RoomType selectByRoomType(String roomType);

    List<RoomType> selectAllWithRest();
}

package cat.udl.tidic.amd.dam_tips;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class UserModel
{

    @SerializedName("question ")
    private String name;
    @SerializedName("category")
    public String category;
    @SerializedName("type")
    private FavourTypeEnum type;
    @SerializedName("id")
    private int id;




    public UserModel(String name, String category, int id, FavourTypeEnum type)
    {
        this.name = name;
        this.id = id;
        this.category = category;
        this.type = type;
    }




    public int getId() { return this.id; }

    public FavourTypeEnum getType(){
        return type;
    }

    public void setType(FavourTypeEnum type){
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void setCategory(String category){this.category = category;}

   public String getCategory(){return category;}



}

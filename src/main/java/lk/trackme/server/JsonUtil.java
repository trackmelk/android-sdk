package lk.trackme.server;

import lk.trackme.server.model.Device;
import lk.trackme.server.model.LoginInfo;
import lk.trackme.server.model.Position;
import lk.trackme.server.model.User;
import lk.trackme.server.model.UserSettings;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Device".equalsIgnoreCase(className)) {
      return new TypeToken<List<Device>>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<List<Error>>(){}.getType();
    }
    
    if ("LoginInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginInfo>>(){}.getType();
    }
    
    if ("Position".equalsIgnoreCase(className)) {
      return new TypeToken<List<Position>>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<List<User>>(){}.getType();
    }
    
    if ("UserSettings".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserSettings>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Device".equalsIgnoreCase(className)) {
      return new TypeToken<Device>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<Error>(){}.getType();
    }
    
    if ("LoginInfo".equalsIgnoreCase(className)) {
      return new TypeToken<LoginInfo>(){}.getType();
    }
    
    if ("Position".equalsIgnoreCase(className)) {
      return new TypeToken<Position>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<User>(){}.getType();
    }
    
    if ("UserSettings".equalsIgnoreCase(className)) {
      return new TypeToken<UserSettings>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};

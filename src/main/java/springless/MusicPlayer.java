package springless;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;}

    public MusicPlayer(){}

    public void setMusic(Music music) {
        this.music = music;}

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}


/* Для примера с коллекцией:
 private List<Music> musicPlaylist = new ArrayList<>();

 Конструктор:
 public void setMusicPlaylist(List<Music> musicPlaylist) {
    this.musicPlaylist = musicPlaylist;
    }

 метод:
   public void playMusic() {
 for (Music mus : musicPlaylist) {
  System.out.println("Playing: " + mus.getSong());}

  в xml:

    <bean id="musicBean1" class="springless.RockMusic">
    </bean>
    <bean id="musicBean2" class="springless.ClassicalMusic">
    </bean>
    <bean id="musicBean3" class="springless.PopMusic">
    </bean>

      <bean id="musicPlayer" class="springless.MusicPlayer">
      <property name="musicPlaylist">
          <list>
              <ref bean="musicBean1"/>
              <ref bean="musicBean2"/>
              <ref bean="musicBean3"/>
          </list>
      </property>

        <property name="name" value="${musicPlayer.name}"/>
        <property name="volume" value="${musicPlayer.volume}"/>
    </bean>

 */
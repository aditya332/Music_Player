package com.somanibrothersservices.musicplayer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentResolver;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<AudioFileModel> audioFileModelList = new ArrayList<>();
    public static AudioFileModel prevAudioFile = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createSongList();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        Adapter adapter = new Adapter(audioFileModelList);
        recyclerView.setAdapter(adapter);
    }

    public void createSongList(){
        MediaMetadataRetriever mmr = new MediaMetadataRetriever();
        int resourceId;
        Uri uriBeepSound;
        byte[] artBytes;
//        audioFileModelList.add(new AudioFileModel("Animals"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.animals));
        resourceId = R.raw.animals; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("Animals",MediaPlayer.create(this, R.raw.animals),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("Animals",MediaPlayer.create(this, R.raw.animals)));
        }
//        audioFileModelList.add(new AudioFileModel("bekhayali"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.bekhayali));
        resourceId = R.raw.bekhayali; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("Bekhayali",MediaPlayer.create(this, R.raw.bekhayali),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("Bekhayali",MediaPlayer.create(this, R.raw.bekhayali)));
        }
//        audioFileModelList.add(new AudioFileModel("forbes"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.forbes));
        resourceId = R.raw.forbes; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("Forbes",MediaPlayer.create(this, R.raw.forbes),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("Forbes",MediaPlayer.create(this, R.raw.forbes)));
        }
//        audioFileModelList.add(new AudioFileModel("gazab_Ka_Hain_Yeh_Din"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.gazab_ka_hain_yeh_din));
        resourceId = R.raw.gazab_ka_hain_yeh_din; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("gazab_Ka_Hain_Yeh_Din",MediaPlayer.create(this, R.raw.gazab_ka_hain_yeh_din),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("gazab_Ka_Hain_Yeh_Din",MediaPlayer.create(this, R.raw.gazab_ka_hain_yeh_din)));
        }
//        audioFileModelList.add(new AudioFileModel("give_Me_Some_Sunshine"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.give_me_some_sunshine));
        resourceId = R.raw.give_me_some_sunshine; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("give_me_some_sunshine",MediaPlayer.create(this, R.raw.give_me_some_sunshine),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("give_me_some_sunshine",MediaPlayer.create(this, R.raw.give_me_some_sunshine)));
        }
//        audioFileModelList.add(new AudioFileModel("Kya hua tera wada"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.kya_hua_tera_wada));
        resourceId = R.raw.kya_hua_tera_wada; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("Kya hua tera wada",MediaPlayer.create(this, R.raw.kya_hua_tera_wada),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("Kya hua tera wada",MediaPlayer.create(this, R.raw.kya_hua_tera_wada)));
        }
//        audioFileModelList.add(new AudioFileModel("one_Bottle_Down"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.one_bottle_down));
        resourceId = R.raw.one_bottle_down; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("one_bottle_down",MediaPlayer.create(this, R.raw.one_bottle_down),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("one_bottle_down",MediaPlayer.create(this, R.raw.one_bottle_down)));
        }
//        audioFileModelList.add(new AudioFileModel("raabta"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.raabta));
        resourceId = R.raw.raabta; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("raabta",MediaPlayer.create(this, R.raw.raabta),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("raabta",MediaPlayer.create(this, R.raw.raabta)));
        }
//        audioFileModelList.add(new AudioFileModel("tum_Hi_Ho"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.tum_hi_ho));
        resourceId = R.raw.tum_hi_ho; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("tum_hi_ho",MediaPlayer.create(this, R.raw.tum_hi_ho),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("tum_hi_ho",MediaPlayer.create(this, R.raw.tum_hi_ho)));
        }
//        audioFileModelList.add(new AudioFileModel("friends"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.friends));
        resourceId = R.raw.friends; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("friends",MediaPlayer.create(this, R.raw.friends),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("friends",MediaPlayer.create(this, R.raw.friends)));
        }
//        audioFileModelList.add(new AudioFileModel("himym"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.himym));
        resourceId = R.raw.himym; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("himym",MediaPlayer.create(this, R.raw.himym),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("himym",MediaPlayer.create(this, R.raw.himym)));
        }
//        audioFileModelList.add(new AudioFileModel("narcos"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.narcos));
        resourceId = R.raw.narcos; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("narcos",MediaPlayer.create(this, R.raw.narcos),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("narcos",MediaPlayer.create(this, R.raw.narcos)));
        }
//        audioFileModelList.add(new AudioFileModel("tbbt"));
//        audioFileModelList.get(audioFileModelList.size()-1).setmPlayer(MediaPlayer.create(this, R.raw.tbbt));
        resourceId = R.raw.tbbt; // r.mipmap.yourmipmap; R.drawable.yourdrawable
        uriBeepSound = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(resourceId))
                .appendPath(getResources().getResourceTypeName(resourceId))
                .appendPath(getResources().getResourceEntryName(resourceId))
                .build();
        mmr.setDataSource(this,uriBeepSound);
        artBytes =  mmr.getEmbeddedPicture();
        if(artBytes!=null) {
            Bitmap bm = BitmapFactory.decodeByteArray(artBytes, 0, artBytes.length);
            audioFileModelList.add(new AudioFileModel("tbbt",MediaPlayer.create(this, R.raw.tbbt),bm));
        } else {
            audioFileModelList.add(new AudioFileModel("tbbt",MediaPlayer.create(this, R.raw.tbbt)));
        }
    }
}

class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private List<AudioFileModel> audioFileModels;

    public Adapter(List<AudioFileModel> audioFileModels) {
        this.audioFileModels = audioFileModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.audio_item, parent, false);
        return new Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(holder.getAdapterPosition());
    }

    @Override
    public int getItemCount() {
        return audioFileModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private SeekBar seekBar;
        private Button playB, pauseB, volumeB;
        private Group selectG;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView);
            seekBar = itemView.findViewById(R.id.seekBar);
            playB = itemView.findViewById(R.id.playButton);
            pauseB = itemView.findViewById(R.id.pauseButton);
            selectG = itemView.findViewById(R.id.groupOnSelect);
            imageView = itemView.findViewById(R.id.imageView);
        }

        public void setData(final int position ) {
            String nameT = audioFileModels.get(position).getName();
            name.setText(nameT);
            if (audioFileModels.get(position).getBitmap() != null) {
                imageView.setBackgroundTintList(ColorStateList.valueOf(itemView.getResources().getColor(R.color.white)));
                imageView.setImageBitmap(audioFileModels.get(position).getBitmap());
            } else {
                imageView.setImageResource(R.drawable.ic_music_video_black_24dp);
            }
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mediaPlayer = audioFileModels.get(position).getmPlayer();
//                    notifyDataSetChanged();
                    if (!audioFileModels.get(position).isSelected) {
                        if (MainActivity.prevAudioFile != null) {
//                            MainActivity.prevAudioFile.getmPlayer().stop();
//                            MainActivity.prevAudioFile.setSelected(false);
                            MainActivity.prevAudioFile.getGroup().setVisibility(View.GONE);
                            MainActivity.prevAudioFile.getTextView().setTextColor(itemView.getResources().getColor(R.color.audioUnSelected));
                            audioFileModels.get(MainActivity.prevAudioFile.getPostition()).setSelected(false);
                            audioFileModels.get(MainActivity.prevAudioFile.getPostition()).getmPlayer().stop();
                        }
                        selectG.setVisibility(View.VISIBLE);
                        playB.setVisibility(View.GONE);
                        pauseB.setVisibility(View.VISIBLE);
                        name.setTextColor(itemView.getResources().getColor(R.color.audioSelected));
                        mediaPlayer.start();
                        seekBar.setMax(mediaPlayer.getDuration());
                        Thread updateSeekBar = new Thread() {
                            @Override
                            public void run() {
                                int totalDuration = mediaPlayer.getDuration();
                                int currentPosition = 0;

                                while (currentPosition < totalDuration) {
                                    try {
                                        sleep(500);
                                        currentPosition = mediaPlayer.getCurrentPosition();
                                        seekBar.setProgress(currentPosition);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        };
                        updateSeekBar.start();
                        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                            @Override
                            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                            }

                            @Override
                            public void onStartTrackingTouch(SeekBar seekBar) {

                            }

                            @Override
                            public void onStopTrackingTouch(SeekBar seekBar) {
                                mediaPlayer.seekTo(seekBar.getProgress());
                            }
                        });
                        playB.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                playB.setVisibility(View.GONE);
                                pauseB.setVisibility(View.VISIBLE);
                                mediaPlayer.start();
                            }
                        });
                        pauseB.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                playB.setVisibility(View.VISIBLE);
                                pauseB.setVisibility(View.GONE);
                                mediaPlayer.pause();
                                seekBar.setMax(mediaPlayer.getDuration());
                            }
                        });
                        audioFileModels.get(position).setSelected(true);
                        MainActivity.prevAudioFile = new AudioFileModel(mediaPlayer,selectG,name,position);
                    } else {
                        mediaPlayer.stop();
                        name.setTextColor(itemView.getResources().getColor(R.color.audioUnSelected));
                        selectG.setVisibility(View.GONE);
                        playB.setVisibility(View.GONE);
                        pauseB.setVisibility(View.GONE);
                        audioFileModels.get(position).setSelected(false);
                        MainActivity.prevAudioFile = null;
                    }
                    audioFileModels.get(position).setmPlayer(mediaPlayer);
                }
            });
        }
    }
}

class AudioFileModel {
    String name;
    boolean isSelected;
    MediaPlayer mPlayer;
    Group group;
    TextView textView;
    int postition;
    Bitmap bitmap;

    public AudioFileModel(String name, MediaPlayer mPlayer, Bitmap bitmap) {
        this.name = name;
        this.mPlayer = mPlayer;
        this.bitmap = bitmap;
        this.isSelected = false;
    }

    public AudioFileModel(String name, MediaPlayer mPlayer) {
        this.name = name;
        this.mPlayer = mPlayer;
        this.isSelected = false;
        this.bitmap = null;
    }

    public AudioFileModel(MediaPlayer mPlayer, Group group, TextView textView, int postition) {
        this.mPlayer = mPlayer;
        this.group = group;
        this.textView = textView;
        this.postition = postition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        this.isSelected = selected;
    }

    public MediaPlayer getmPlayer() {
        return mPlayer;
    }

    public void setmPlayer(MediaPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public int getPostition() {
        return postition;
    }

    public void setPostition(int postition) {
        this.postition = postition;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}

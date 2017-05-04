package com.example.android.zeplin.modelClass;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mark63 on 29/4/17.
 */

public class ModelClass implements Parcelable {
    public static final Creator<ModelClass> CREATOR = new Creator<ModelClass>() {
        @Override
        public ModelClass createFromParcel(final Parcel in) {
            return new ModelClass(in);
        }

        @Override
        public ModelClass[] newArray(final int size) {
            return new ModelClass[size];
        }
    };

    private int img;
    private String text;
    private int imageNetwork;
    private String place;
    private String name;
    private String textstart;
    private String textend;


    /**
     * @param in unput variable
     */
    protected ModelClass(final Parcel in) {

        img = in.readInt();
        text = in.readString();
        imageNetwork = in.readInt();
        place = in.readString();
        name = in.readString();
        textstart = in.readString();
        textend = in.readString();
    }

    /**
     * @param image image is passed in constructor for Discover
     * @param text  text  is passed in constructor
     */
    public ModelClass(final int image, final String text) {
        this.img = image;
        this.text = text;

    }


    /**
     * @param image     image is send for Request
     * @param name      name is send for Request
     * @param textstart text start is send for Request
     * @param textend   text end is send for Request
     */
    public ModelClass(final int image, final String name, final String textstart, final String textend) {
        this.img = image;
        this.name = name;
        this.textstart = textstart;
        this.textend = textend;
    }

    /**
     * @param imageNet  image is passed for Mynetwork
     * @param placename place name is passed for Mynetwork
     * @param name      name of user image is passed for Mynetwork
     */

    public ModelClass(final int imageNet, final String placename, final String name) {
        this.imageNetwork = imageNet;
        this.place = placename;
        this.name = name;
    }

    /**
     * @return zero
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * @return image
     */
    public int getImg() {
        return img;
    }

    /**
     * @return text (label)
     */
    public String getText() {
        return text;
    }

    /**
     * @return image
     */
    public int getImageNetwork() {

        return imageNetwork;
    }


    /**
     * @return place
     */

    public String getPlace() {
        return place;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return text start
     */
    public String getTextstart() {
        return textstart;
    }

    /**
     * @return text end;
     */
    public String getTextend() {
        return textend;
    }


    /**
     * @param dest  write values here
     * @param flags give flag value
     */
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeInt(img);
        dest.writeString(text);
        dest.writeInt(imageNetwork);
        dest.writeString(place);
        dest.writeString(name);
        dest.writeString(textstart);
        dest.writeString(textend);
    }


}

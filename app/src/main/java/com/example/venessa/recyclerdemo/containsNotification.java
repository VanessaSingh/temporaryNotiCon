package com.example.venessa.recyclerdemo;

/**
 * Created by Venessa on 4/1/2017.
 */

public class containsNotification {

        int _id;
        String _title;
        String _notification;

        public int get_id() {
            return _id;
        }

        public void set_id(int _id) {
            this._id = _id;
        }

        public String get_title() {
            return _title;
        }

        public void set_title(String _title) {
            this._title = _title;
            //this._title = "Title";
        }

        public String get_notification() {
            return _notification;
        }

        public void set_notification(String _notification) {
            this._notification = _notification;
            //this._notification = "Hello";
        }
        public containsNotification(int _id, String _title,String _notification){
            this._id = _id;
            this._title = _title;
            this._notification = _notification;
        }


    }


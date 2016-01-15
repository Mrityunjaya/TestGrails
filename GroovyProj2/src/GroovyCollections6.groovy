class HourMinute {
    int minute;
    int hour;

    HourMinute plus(HourMinute hmObj) {
        int modMinute = this.minute + hmObj.minute
        int modHour = this.hour + hmObj.hour
        if (modMinute >= 60) {
            modHour += (int) (modMinute / 60)
            modMinute -= 60;
        }
        return new HourMinute(minute: modMinute, hour: modHour)
    }

    /**
     *
     * @param hmObj
     * @return
     */
    HourMinute minus(HourMinute hmObj) {
        if(this.hour < hmObj.hour){
            println "Time can not be negative"
            return this;
        }else{

        }
        int modMinute = this.minute - hmObj.minute
        int modHour = this.hour - hmObj.hour
        if (this.minute < hmObj.minute) {
            modHour += (int) (modMinute / 60)
            modMinute -= 60;
        }
        return new HourMinute(minute: modMinute, hour: modHour)
    }
}
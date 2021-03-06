

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package metadata.Location;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class LocationData   implements Copyable, Serializable{

    public String name=  "" ; /* maximum length = (60) */
    public double latitude= 0;
    public double longitude= 0;

    public LocationData() {

    }
    public LocationData (LocationData other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        LocationData self;
        self = new  LocationData();
        self.clear();
        return self;

    }

    public void clear() {

        name=  ""; 
        latitude= 0;
        longitude= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        LocationData otherObj = (LocationData)o;

        if(!name.equals(otherObj.name)) {
            return false;
        }
        if(latitude != otherObj.latitude) {
            return false;
        }
        if(longitude != otherObj.longitude) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += name.hashCode(); 
        __result += (int)latitude;
        __result += (int)longitude;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>LocationDataTypeSupport</code>
    * rather than here by using the <code>-noCopyable</code> option
    * to rtiddsgen.
    * 
    * @param src The Object which contains the data to be copied.
    * @return Returns <code>this</code>.
    * @exception NullPointerException If <code>src</code> is null.
    * @exception ClassCastException If <code>src</code> is not the 
    * same type as <code>this</code>.
    * @see com.rti.dds.infrastructure.Copyable#copy_from(java.lang.Object)
    */
    public Object copy_from(Object src) {

        LocationData typedSrc = (LocationData) src;
        LocationData typedDst = this;

        typedDst.name = typedSrc.name;
        typedDst.latitude = typedSrc.latitude;
        typedDst.longitude = typedSrc.longitude;

        return this;
    }

    public String toString(){
        return toString("", 0);
    }

    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();        

        if (desc != null) {
            CdrHelper.printIndent(strBuffer, indent);
            strBuffer.append(desc).append(":\n");
        }

        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("name: ").append(name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("latitude: ").append(latitude).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("longitude: ").append(longitude).append("\n");  

        return strBuffer.toString();
    }

}


/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package metadata.Metadata;

import com.rti.dds.typecode.*;

public class  MetadataTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;

        StructMember sm[]=new StructMember[4];

        sm[__i]=new  StructMember("timestamp", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,0 , false);__i++;
        sm[__i]=new  StructMember("isValid", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,1 , false);__i++;
        sm[__i]=new  StructMember("location", false, (short)-1,  false,(TypeCode) metadata.Location.LocationDataTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("source", false, (short)-1,  false,(TypeCode) metadata.Source.SourceDataTypeCode.VALUE,3 , false);__i++;



        StructMember sm[]=new StructMember[3];

        sm[__i]=new  StructMember("timestamp", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,0 , false);__i++;
        sm[__i]=new  StructMember("location", false, (short)-1,  false,(TypeCode) metadata.Location.LocationDataTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("source", false, (short)-1,  false,(TypeCode) metadata.Source.SourceDataTypeCode.VALUE,2 , false);__i++;


        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("metadata::Metadata::Metadata",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}


package com.aspose.slides;

import java.util.UUID;

public interface IControl extends ISlideComponent {
   String getName();

   void setName(String var1);

   UUID getClassId();

   IPictureFillFormat getSubstitutePictureFormat();

   IShapeFrame getFrame();

   void setFrame(IShapeFrame var1);

   IControlPropertiesCollection getProperties();

   int getPersistence();

   byte[] getActiveXControlBinary();
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import java.util.UUID;

public interface ISensitivityLabel {
   String getId();

   void setId(String var1);

   UUID getSiteId();

   void setSiteId(UUID var1);

   boolean isEnabled();

   void setEnabled(boolean var1);

   boolean isRemoved();

   void setRemoved(boolean var1);

   int getAssignmentMethodType();

   void setAssignmentMethodType(int var1);

   IGenericList<Integer> getContentMarkTypes();
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import java.util.UUID;

public interface ISensitivityLabelCollection extends IGenericEnumerable<ISensitivityLabel> {
   ISensitivityLabel get_Item(int var1);

   ISensitivityLabel add(String var1, UUID var2, boolean var3, int var4);

   int add(ISensitivityLabel var1);

   void removeAt(int var1);

   void clear();

   int getCount();
}

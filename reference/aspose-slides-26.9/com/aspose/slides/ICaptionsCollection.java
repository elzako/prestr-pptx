package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import java.io.InputStream;

public interface ICaptionsCollection extends IGenericEnumerable<ICaptions> {
   ICaptions get_Item(int var1);

   ICaptions add(String var1, String var2);

   ICaptions add(String var1, InputStream var2);

   void remove(ICaptions var1);

   void removeAt(int var1);

   void clear();

   int getCount();
}

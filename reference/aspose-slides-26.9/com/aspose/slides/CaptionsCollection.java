package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import java.io.InputStream;

public final class CaptionsCollection implements ICaptionsCollection {
   private final IPictureFrame n5;
   private final List<ICaptions> l6;

   @Override
   public final ICaptions get_Item(int index) {
      return this.l6.get_Item(index);
   }

   @Override
   public final ICaptions add(String label, String filePath) {
      if (filePath == null) {
         throw new ArgumentNullException("filePath", "File path cannot be null");
      }

      if ("".equals(filePath)) {
         throw new ArgumentException("File path cannot be empty", "filePath");
      }

      com.aspose.slides.internal.z0k.n3 var3 = new com.aspose.slides.internal.z0k.n3(filePath, 3, 1, 1);

      try {
         return this.n5(label, var3);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   public final ICaptions add(String label, InputStream stream) {
      return this.n5(label, com.aspose.slides.internal.z0k.t4.fromJava(stream));
   }

   ICaptions n5(String var1, com.aspose.slides.internal.z0k.t4 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("stream", "Input stream cannot be null");
      }

      byte[] var3 = com.aspose.slides.internal.q7.n5.n5(var2);
      if (!"WEBVTT".equals(com.aspose.slides.internal.l7h.j5.z3().l6(var3, 0, 6))) {
         throw new ArgumentException("Input data is not in the WebVTT format");
      }

      Captions var4 = new Captions(((Presentation)this.n5.getPresentation()).z3().n5(var3), var1, "");
      this.l6.addItem(var4);
      return var4;
   }

   @Override
   public final void remove(ICaptions captions) {
      this.l6.removeItem(captions);
   }

   @Override
   public final void removeAt(int index) {
      this.l6.removeAt(index);
   }

   @Override
   public final void clear() {
      this.l6.clear();
   }

   @Override
   public final int getCount() {
      return this.l6.size();
   }

   @Override
   public final IGenericEnumerator<ICaptions> iterator() {
      return this.l6.iterator();
   }

   final ICaptions n5(String var1, String var2, n4 var3) {
      Captions var4 = new Captions(var3, var1, var2);
      this.l6.addItem(var4);
      return var4;
   }

   CaptionsCollection(IPictureFrame parentImmediate) {
      this.n5 = parentImmediate;
      this.l6 = new List<>();
   }
}

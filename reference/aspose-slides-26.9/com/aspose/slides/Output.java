package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

public final class Output {
   private final ITemplateEngine n5;
   private final Storage l6;
   private final IGenericDictionary<String, IOutputFile> k5 = new com.aspose.slides.internal.n2d.z1<>(String.class, IOutputFile.class);
   private final IGenericDictionary<Object, IOutputFile> u3 = new Dictionary<>();

   Output(ITemplateEngine templateEngine, Storage global) {
      this.n5 = templateEngine;
      this.l6 = global;
   }

   public final <TContextObject> IOutputFile add(String path, String templateKey, TContextObject contextObject) {
      if (path == null) {
         throw new ArgumentNullException("path");
      }

      if (templateKey == null) {
         throw new ArgumentNullException("templateKey");
      }

      if (contextObject == null) {
         throw new ArgumentNullException("contextObject");
      }

      if (this.k5.containsKey(path)) {
         throw new ArgumentException("Already added", "path");
      }

      o2f var4 = new o2f(this.n5);
      var4.n5(new TemplateContext<>(contextObject, this, this.l6));
      var4.n5(templateKey);
      this.k5.addItem(path, var4);
      return var4;
   }

   final <TContextObject> IOutputFile n5(com.aspose.slides.internal.z0k.t4 var1, String var2, TContextObject var3) {
      String var4 = "?index";
      if (var2 == null) {
         throw new ArgumentNullException("templateKey");
      }

      if (var3 == null) {
         throw new ArgumentNullException("contextObject");
      }

      if (this.k5.containsKey(var4)) {
         throw new ArgumentException("Already added", "path");
      }

      o2f var5 = new o2f(this.n5);
      var5.n5(new TemplateContext<>(var3, this, this.l6));
      var5.n5(var2);
      var5.l6(var1);
      this.k5.addItem(var4, var5);
      return var5;
   }

   public final IOutputFile add(String path, IPPImage image) {
      if (path == null) {
         throw new ArgumentNullException("path");
      }

      if (image == null) {
         throw new ArgumentNullException("image");
      }

      if (this.k5.containsKey(path)) {
         throw new ArgumentException("Already added", "path");
      }

      PPImage var3 = (PPImage)image;
      c9 var5;
      if (var3.s7()) {
         com.aspose.slides.internal.o9b.l6 var4 = com.aspose.slides.internal.n8e.k7.n5(
            var3.getBinaryData(), com.aspose.slides.internal.o9b.p8.n5(var3.k5().h0()).a6()
         );
         var5 = new m2e(u4i.n5(var4));
      } else {
         var5 = new r2z(image);
      }

      this.k5.addItem(path, var5);
      return var5;
   }

   public final IOutputFile add(String path, IImage image) {
      if (path == null) {
         throw new ArgumentNullException("path");
      }

      if (image == null) {
         throw new ArgumentNullException("image");
      }

      if (this.k5.containsKey(path)) {
         throw new ArgumentException("Already added", "path");
      }

      m2e var3 = new m2e(image);
      this.k5.addItem(path, var3);
      return var3;
   }

   public final IOutputFile add(String path, IVideo video) {
      if (path == null) {
         throw new ArgumentNullException("path");
      }

      if (video == null) {
         throw new ArgumentNullException("video");
      }

      if (this.k5.containsKey(path)) {
         throw new ArgumentException("Already added", "path");
      }

      b6o var3 = new b6o(video);
      this.k5.addItem(path, var3);
      return var3;
   }

   public final IOutputFile add(String path, IAudio audio) {
      if (path == null) {
         throw new ArgumentNullException("path");
      }

      if (audio == null) {
         throw new ArgumentNullException("audio");
      }

      if (this.k5.containsKey(path)) {
         throw new ArgumentException("Already added", "path");
      }

      c9 var3 = new c9(audio.getBinaryData());
      this.k5.addItem(path, var3);
      return var3;
   }

   public final IOutputFile add(String path, IFontData fontData, int fontStyle) {
      if (path == null) {
         throw new ArgumentNullException("path");
      }

      if (fontData == null) {
         throw new ArgumentNullException("fontData");
      }

      if (this.k5.containsKey(path)) {
         throw new ArgumentException("Already added", "path");
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(fontData, c4y.class)) {
         throw new NotImplementedException(
            com.aspose.slides.ms.System.d1.n5(new Object[]{"Export of ", com.aspose.slides.ms.System.j8.n5(fontData), " type is not supported"})
         );
      }

      int var4 = fontStyle;
      c4y var5 = (c4y)fontData;
      if (!var5.h0().containsKey(var4)) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               com.aspose.slides.ms.System.s3.n5(FontStyleType.class, fontStyle), " font style is not available for ", fontData.getFontName(), " font"
            })
         );
      }

      o0l var6 = new o0l(var5, var4);
      this.k5.addItem(path, var6);
      return var6;
   }

   public final IOutputFile add(String path, String textContent) {
      if (path == null) {
         throw new ArgumentNullException("path");
      }

      if (com.aspose.slides.ms.System.d1.n5(textContent)) {
         throw new ArgumentNullException("textContent");
      }

      if (this.k5.containsKey(path)) {
         throw new ArgumentException("Already added", "path");
      }

      f8w var3 = new f8w(textContent);
      this.k5.addItem(path, var3);
      return var3;
   }

   public final void bindResource(IOutputFile outputFile, Object obj) {
      this.n5(obj, outputFile);
   }

   public final String getResourcePath(Object obj) {
      if (obj == null) {
         throw new ArgumentNullException("obj");
      }

      if (!this.u3.containsKey(obj)) {
         throw new ArgumentException("Resource not found", "obj");
      }

      IOutputFile var2 = this.u3.get_Item(obj);
      return this.l6(var2);
   }

   final IOutputFile n5(String var1, byte[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("path");
      }

      if (var2 == null) {
         throw new ArgumentNullException("binaryData");
      }

      if (this.k5.containsKey(var1)) {
         throw new ArgumentException("Already added", "path");
      }

      c9 var3 = new c9(var2);
      this.k5.addItem(var1, var3);
      return var3;
   }

   final IGenericDictionary<String, IOutputFile> n5() {
      return this.k5;
   }

   private void n5(Object var1, IOutputFile var2) {
      if (this.u3.containsKey(var1)) {
         throw new InvalidOperationException();
      }

      if (!this.n5(var2)) {
         throw new InvalidOperationException();
      }

      this.u3.addItem(var1, var2);
   }

   private boolean n5(IOutputFile var1) {
      IGenericEnumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (((IOutputFile)var3.getValue()).equals(var1)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   private String l6(IOutputFile var1) {
      IGenericEnumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (((IOutputFile)var3.getValue()).equals(var1)) {
               return (String)var3.getKey();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      throw new InvalidOperationException();
   }
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.DOMResourcesUtils;
import com.aspose.slides.ms.System.IDisposable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public final class ImageCollection extends DomObject<Presentation> implements IImageCollection {
   private final List<IPPImage> n5;
   private PPImage l6;
   private PPImage k5;
   private PPImage u3;
   private final List<PPImage> a6 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "image/bmp", "image/x-emf", "image/jpeg", "image/png", "image/x-wmf", "image/pict", "image/gif", "image/tiff", "image/webp"
   );

   ImageCollection(Presentation parentImmediate) {
      super(parentImmediate);
      this.n5 = new List<>();
   }

   final PPImage n5(byte[] var1, long var2) {
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            PPImage var5 = (PPImage)var4.next();
            if (var5.u9() == var2) {
               byte[] var6 = var5.h0();
               if (var6.length == var1.length) {
                  for (int var7 = 0; var7 < var1.length; var7++) {
                     if ((var1[var7] & 255) != (var6[var7] & 255)) {
                     }
                  }

                  return var5;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return null;
   }

   final PPImage n5(com.aspose.slides.ms.System.o0 var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            PPImage var3 = (PPImage)var2.next();
            if (var3.n3().equals(var1.k5())) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   final PPImage n5(SvgImage var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            IPPImage var3 = (IPPImage)var2.next();
            if (var3.getSvgImage() != null && ((SvgImage)var3.getSvgImage()).l6() == var1.l6()) {
               return (PPImage)var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   final void n5(PPImage var1) {
      this.n5.addItem(var1);
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final IPPImage get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final IPPImage addImage(IPPImage imageSource) {
      PPImage var2 = (PPImage)imageSource;
      return this.n5.containsItem(var2) ? var2 : this.n5(var2.h0());
   }

   @Override
   public final IPPImage addImage(IImage image) {
      return this.n5(((u4i)image).n5());
   }

   IPPImage n5(com.aspose.slides.internal.z0k.e2 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = l6(var1);
      byte[] var3 = com.aspose.slides.internal.q7.n5.n5(var2);
      return this.n5(var3);
   }

   @Override
   public final IPPImage addImage(InputStream stream) {
      return this.n5(com.aspose.slides.internal.z0k.t4.fromJava(stream));
   }

   IPPImage n5(com.aspose.slides.internal.z0k.t4 var1) {
      return this.n5(l6(var1));
   }

   @Override
   public final IPPImage addImage(InputStream stream, int loadingStreamBehavior) {
      return this.n5(com.aspose.slides.internal.z0k.t4.fromJava(stream), loadingStreamBehavior);
   }

   IPPImage n5(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      com.aspose.slides.internal.q7.c8 var3;
      switch (var2) {
         case 0:
            var3 = this.u9.w1().n5(com.aspose.slides.internal.q7.n5.l6(var1), false, true);
            break;
         case 1:
            var3 = this.u9.w1().n5(var1);
            break;
         default:
            throw new ArgumentOutOfRangeException("loadingStreamBehavior", com.aspose.slides.ms.System.s3.n5(LoadingStreamBehavior.class, var2), null);
      }

      return new PPImage(this.u9, var3);
   }

   @Override
   public final IPPImage addImage(byte[] buffer) {
      return this.n5(buffer);
   }

   @Override
   public final IPPImage addImage(ISvgImage svgImage) {
      PPImage var2 = this.n5((SvgImage)svgImage);
      return var2 != null ? var2 : this.n5(svgImage, Float.NaN, Float.NaN, 1.0F, false);
   }

   final IPPImage n5(com.aspose.slides.internal.o9b.t4 var1) {
      return this.n5(null, var1);
   }

   final IPPImage n5(ISvgImage var1, float var2) {
      return this.n5(var1, Float.NaN, Float.NaN, var2, true);
   }

   final IPPImage n5(ISvgImage var1, float var2, float var3, float var4, boolean var5) {
      boolean var6 = false;
      boolean[] var7 = new boolean[]{false};
      com.aspose.slides.internal.z0k.e2 var8 = this.n5(var1, var2, var3, var4, var7);
      var6 = var7[0];
      IPPImage var11;
      if (var6 && var5) {
         int var9 = com.aspose.slides.ms.System.n1.k5(var2)
            ? Integer.MIN_VALUE
            : com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.n2d.t2.n5(var2), 14);
         int var10 = com.aspose.slides.ms.System.n1.k5(var3)
            ? Integer.MIN_VALUE
            : com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.n2d.t2.n5(var3), 14);
         var11 = this.n5(com.aspose.slides.internal.n8e.k7.n5(var8.toArray(), var9, var10));
         var8.close();
      } else {
         var11 = this.n5(var8);
      }

      var11.setSvgImage(var1);
      return var11;
   }

   final IPPImage n5(com.aspose.slides.internal.e5a.y2 var1) {
      boolean var2 = this.u9.a6().getBlobManagementOptions().getPresentationLockingBehavior() == 1;
      com.aspose.slides.internal.q7.c8 var3 = this.u9.w1().n5(var1, var2);
      return new PPImage(this.u9, var3);
   }

   final IPPImage n5(ISvgImage var1) {
      PPImage var2 = new PPImage(this.u9, null, com.aspose.slides.internal.o9b.y2.n5.n3(), 0L);
      var2.setSvgImage(var1);
      return var2;
   }

   final IPPImage n5(byte[] var1) {
      return this.n5(var1, null);
   }

   private IPPImage n5(byte[] var1, com.aspose.slides.internal.o9b.t4 var2) {
      return this.n5(var1, var2, true);
   }

   final IPPImage l6(ISvgImage var1) {
      boolean var2 = false;
      boolean[] var3 = new boolean[]{false};
      com.aspose.slides.internal.z0k.e2 var4 = this.n5(var1, Float.NaN, Float.NaN, 1.0F, var3);
      var2 = var3[0];
      byte[] var5 = com.aspose.slides.internal.q7.n5.n5(var4);
      return this.l6(var5);
   }

   final PPImage l6(byte[] var1) {
      return this.n5(var1, null, false);
   }

   private PPImage k5(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = l6(l6(var1));
      byte[] var3 = com.aspose.slides.internal.q7.n5.n5(var2);
      return this.n5(var3, null, false);
   }

   private PPImage n5(byte[] var1, com.aspose.slides.internal.o9b.t4 var2, boolean var3) {
      if (var1 == null && var2 == null) {
         throw new PptxEditException("Null image adding");
      }

      if (var1 != null) {
         int var4 = 0;
         int[] var5 = new int[]{0};
         boolean var6 = com.aspose.slides.internal.k4d.a6.n5(var1, var5);
         var4 = var5[0];
         if (var6) {
            byte[] var7 = new byte[var1.length - var4];
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var4, com.aspose.slides.ms.System.u3.n5((Object)(var7)), 0, var7.length);
            var1 = var7;
         }
      }

      if (var1 == null) {
         com.aspose.slides.internal.j9e.x8 var14 = var2.x8();
         if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.o9b.l6.class)
            && com.aspose.slides.ms.System.o0.l6(var14.n5(), com.aspose.slides.internal.j9e.x8.u9().n5())
            && (
               com.aspose.slides.ms.System.o0.n5(var14.n5(), com.aspose.slides.internal.j9e.x8.t2().n5())
                  || com.aspose.slides.ms.System.o0.n5(var14.n5(), com.aspose.slides.internal.j9e.x8.s7().n5())
                  || (var2.s7() & 262144) == 262144
                  || (var2.s7() & 65536) == 65536
                  || var2.e2() < 16
                  || var2.h0() < 16
            )) {
            var14 = com.aspose.slides.internal.j9e.x8.s7();
         }

         com.aspose.slides.internal.z0k.e2 var15 = new com.aspose.slides.internal.z0k.e2();

         try {
            var2.n5(var15, var14);
            var1 = var15.toArray();
         } finally {
            if (var15 != null) {
               var15.dispose();
            }
         }
      }

      long var9 = com.aspose.slides.internal.h3k.u3.n5(var1);
      PPImage var16 = this.n5(var1, var9);
      if (var16 != null && var16.getSvgImage() == null) {
         return var16;
      }

      com.aspose.slides.internal.o9b.y2 var18 = new com.aspose.slides.internal.o9b.y2(0, 0, 0, 0);
      if (var2 != null) {
         var18 = new com.aspose.slides.internal.o9b.y2(0, 0, var2.e2(), var2.h0());
      }

      com.aspose.slides.internal.q7.c8 var8 = this.u9.w1().n5(var1);
      var16 = new PPImage(this.u9, var8, var9, var18.n3());
      if (var3) {
         this.n5(var16);
      }

      return var16;
   }

   final IPPImage n5(String var1, Dictionary<String, IPPImage> var2) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         return null;
      }

      int var3 = 0;
      p3w var4 = new p3w(var1);
      if (this.u9.a6() != null && this.u9.a6().getResourceLoadingCallback() != null) {
         var3 = this.u9.a6().getResourceLoadingCallback().resourceLoading(var4);
      }

      switch (var3) {
         case 0:
            var1 = var4.getUri();
            String var5 = "";

            try {
               var5 = com.aspose.slides.internal.z0k.z1.n5(var1);
            } catch (RuntimeException var30) {
            }

            if (!com.aspose.slides.ms.System.d1.n5(this.u9.l6) && com.aspose.slides.ms.System.d1.a6(var1, var5)) {
               var1 = com.aspose.slides.internal.z0k.z1.l6(com.aspose.slides.internal.z0k.z1.u9(this.u9.l6), var1);
            }

            if (!com.aspose.slides.ms.System.d1.n5(var5) && com.aspose.slides.internal.z0k.u9.k5(var1)) {
               if (com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1), ".pdf")
                  || com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1), ".pict")) {
                  this.k5(var1);
                  return null;
               }

               if (var2 == null || !var2.containsKey(var1)) {
                  return this.l6(var1, var2);
               }
               break;
            }

            if (com.aspose.slides.ms.System.d1.u3(var1, ':') <= 1) {
               String var37 = com.aspose.slides.ms.System.d1.n5("Error occured loading image file: {0}", new Object[]{var1});
               this.n5(var37, 1);
               return null;
            }

            try {
               HttpURLConnection var36 = (HttpURLConnection)new URL(var1).openConnection();
               var36.setConnectTimeout(60000);
               var36.setReadTimeout(60000);
               boolean var40 = false;
               int var8 = var36.getResponseCode();
               if (var8 != 200 && (var8 == 302 || var8 == 301 || var8 == 303)) {
                  var40 = true;
               }

               if (var40) {
                  String var9 = var36.getHeaderField("Location");
                  String var10 = var36.getHeaderField("Set-Cookie");
                  var36 = (HttpURLConnection)new URL(var9).openConnection();
                  var36.setConnectTimeout(60000);
                  var36.setReadTimeout(60000);
                  var36.setRequestProperty("Cookie", var10);
               }

               try {
                  com.aspose.slides.internal.z0k.t4 var41 = com.aspose.slides.internal.z0k.t4.fromJava(var36.getInputStream());

                  try {
                     byte[] var42;
                     if (var41 instanceof com.aspose.slides.internal.v2c.n5) {
                        var42 = ((com.aspose.slides.internal.v2c.n5)var41).toArray();
                     } else {
                        var42 = l6(var41).toArray();
                     }

                     int var11 = com.aspose.slides.internal.k4d.a6.l6(var42);
                     if (var11 != 0 && var11 != 3) {
                        return this.n5(var42, null, false);
                     }

                     this.k5(var1);
                     return null;
                  } finally {
                     if (var41 != null) {
                        var41.dispose();
                     }
                  }
               } finally {
                  if (var36.getInputStream() != null) {
                     var36.getInputStream().close();
                  }

                  if (var36 != null) {
                     var36.disconnect();
                  }
               }
            } catch (MalformedURLException var33) {
               String var39 = com.aspose.slides.ms.System.d1.n5("Error occured loading online image: {0}", new Object[]{var1});
               this.n5(var39, 1);
               com.aspose.slides.internal.n8e.v4.n5(var33);
               return null;
            } catch (IOException var34) {
               String var38 = com.aspose.slides.ms.System.d1.n5("Error occured loading online image: {0}", new Object[]{var1});
               this.n5(var38, 1);
               com.aspose.slides.internal.n8e.v4.n5(var34);
               return null;
            } catch (RuntimeException var35) {
               String var7 = com.aspose.slides.ms.System.d1.n5("Error occured loading online image: {0}", new Object[]{var1});
               this.n5(var7, 1);
               com.aspose.slides.internal.n8e.v4.n5(var35);
               return null;
            }
         case 1:
            return this.n5();
         case 2:
            try {
               if (var4.n5() != null && var4.n5().length > 0) {
                  return this.addImage(var4.n5());
               }

               return null;
            } catch (RuntimeException var29) {
               String var6 = com.aspose.slides.ms.System.d1.n5(
                  "Error occured loading user provided image data. The path of replaced image: {0}", new Object[]{var1}
               );
               this.n5(var6, 1);
               com.aspose.slides.internal.n8e.v4.n5(var29);
               return null;
            }
      }

      return var2 != null ? (IPPImage)var2.get_Item(var1) : null;
   }

   private IPPImage l6(String var1, Dictionary<String, IPPImage> var2) {
      try {
         byte[] var3 = com.aspose.slides.internal.z0k.u9.h0(var1);
         int var9 = com.aspose.slides.internal.k4d.a6.l6(var3);
         if (var9 != 0 && var9 != 3) {
            PPImage var5;
            try {
               var5 = this.n5(var3, null, false);
            } catch (Exception var7) {
               com.aspose.slides.internal.n8e.v4.n5(var7);
               this.l6(var1);
               return null;
            }

            if (var2 != null) {
               var2.addItem(var1, var5);
            }

            return var5;
         } else {
            this.k5(var1);
            return null;
         }
      } catch (RuntimeException var8) {
         String var4 = com.aspose.slides.ms.System.d1.n5("Error occured loading image: {0}", new Object[]{var8.getMessage()});
         this.n5(var4, 1);
         return null;
      }
   }

   final SvgImage n5(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         return null;
      }

      int var2 = 0;
      p3w var3 = new p3w(var1);
      if (this.u9.a6() != null && this.u9.a6().getResourceLoadingCallback() != null) {
         var2 = this.u9.a6().getResourceLoadingCallback().resourceLoading(var3);
      }

      switch (var2) {
         case 0:
            // The callback may redirect the resource while preserving OriginalUri.
            var1 = var3.getUri();
            try {
               if (var1 != null && var1.startsWith("file:")) {
                  var1 = java.nio.file.Paths.get(java.net.URI.create(var1)).toString();
               }
               SvgImage var4 = null;
               byte[] var5 = null;
               String var6 = a6(var1);
               if (com.aspose.slides.internal.z0k.u9.k5(var1) && com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1), ".svg")) {
                  var5 = com.aspose.slides.internal.z0k.u9.h0(var1);
               } else if (!com.aspose.slides.ms.System.d1.n5(var6)
                  && com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var6), ".svg")
                  && !com.aspose.slides.ms.System.d1.n5(this.u9.l6)) {
                  var5 = com.aspose.slides.internal.z0k.u9.h0(com.aspose.slides.internal.z0k.z1.l6(com.aspose.slides.internal.z0k.z1.u9(this.u9.l6), var1));
               }

               if (var5 != null && var5.length > 0) {
                  var4 = new SvgImage(var5);
               }

               return var4;
            } catch (RuntimeException var7) {
               return null;
            }
         case 1:
            return null;
         case 2:
            // Match raster resource loading: use the bytes supplied by the caller.
            return new SvgImage(var3.n5());
         default:
            return null;
      }
   }

   final void l6(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5("GDI+ error occured loading image: {0}", new Object[]{var1});
      this.n5(var2, 1);
   }

   final void k5(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5("Image format is not supported: {0}", new Object[]{var1});
      this.n5(var2, 1);
   }

   final void n5(String var1, int var2) {
      if (this.u9.a6() != null && this.u9.a6().getWarningCallback() != null) {
         com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1, var2);
         var3.sendWarning(this.u9.a6().getWarningCallback());
      }
   }

   private static com.aspose.slides.internal.z0k.e2 l6(com.aspose.slides.internal.z0k.e2 var0) {
      if (k5(var0)) {
         com.aspose.slides.internal.e5a.y4 var1 = new com.aspose.slides.internal.e5a.y4(var0, 1);

         try {
            return l6(var1);
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }
      } else {
         return var0;
      }
   }

   static com.aspose.slides.internal.z0k.e2 l6(com.aspose.slides.internal.z0k.t4 var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.q7.n5.n5(var0, var1, com.aspose.slides.internal.q7.n5.n5);
      var1.setPosition(0L);
      return var1;
   }

   private static boolean k5(com.aspose.slides.internal.z0k.e2 var0) {
      if (var0.getLength() < 2L) {
         return false;
      }

      int var1 = var0.readByte();
      int var2 = var0.readByte();
      var0.seek(-2L, 1);
      return var1 == 31 && var2 == 139;
   }

   static String u3(String var0) {
      switch (h0.n5(var0)) {
         case 0:
            return "bmp";
         case 1:
            return "emf";
         case 2:
            return "jpeg";
         case 3:
            return "png";
         case 4:
            return "wmf";
         case 5:
            return "pict";
         case 6:
            return "gif";
         case 7:
            return "tiff";
         case 8:
            return "webp";
         default:
            return "image";
      }
   }

   static String a6(String var0) {
      int var1 = var0.length();
      int var2 = var1;

      while (--var2 >= 0) {
         char var3 = var0.charAt(var2);
         if (var3 == '\\' || var3 == '/' || var3 == ':') {
            return com.aspose.slides.ms.System.d1.k5(var0, var2 + 1);
         }
      }

      return var0;
   }

   final IPPImage n5() {
      if (this.l6 == null) {
         this.l6 = this.k5(DOMResourcesUtils.getResourceStream("NoImage.emf"));
      }

      return this.l6;
   }

   final PPImage l6() {
      if (this.k5 == null) {
         this.k5 = this.k5(DOMResourcesUtils.getResourceStream("AudioFrame.png"));
      }

      return this.k5;
   }

   final PPImage k5() {
      if (this.u3 == null) {
         this.u3 = (PPImage)this.n5(DOMResourcesUtils.getResourceStream("EmbeddedOLE_template.png"));
      }

      return this.u3;
   }

   final List<PPImage> u3() {
      return this.a6;
   }

   final com.aspose.slides.internal.z0k.e2 n5(ISvgImage var1, float var2, float var3, float var4, boolean[] var5) {
      if (var1 == null) {
         throw new ArgumentNullException("svgImage");
      }

      var5[0] = true;
      double var6 = com.aspose.slides.internal.n2d.t2.n5;
      String var8 = SvgImage.n5(((SvgImage)var1).n5());
      if (var4 > 1.0F) {
         var4 *= 1.3333334F;
      }

      w8j var9 = ((SvgImage)var1).u3();
      com.aspose.slides.internal.w9s.k5 var10 = new com.aspose.slides.internal.w9s.k5(var9);
      return var10.n5(var8, var4);
   }

   final void n5(IPPImage var1) {
      this.n5.removeItem(var1);
   }

   void a6() {
      this.n5.clear();
   }

   @Override
   public final IGenericEnumerator<IPPImage> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IPPImage> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }
}

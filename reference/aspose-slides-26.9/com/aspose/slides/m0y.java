package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class m0y {
   static IPictureFrame n5(ShapeCollection var0, com.aspose.slides.internal.k4y.z1 var1, com.aspose.slides.internal.k4y.z8m var2, t5w var3) {
      VideoFrame var4 = null;
      String var5 = var2.n5();
      com.aspose.slides.ms.System.Xml.m8 var6 = r8.n5(var1.n5().k5().c8());
      if (var6 != null) {
         if (var6.u9("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
            String var7 = var6.u3("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            if (!com.aspose.slides.ms.System.d1.n5(var7)) {
               com.aspose.slides.internal.c8m.r7 var8 = var3.k7().n5(var7);
               com.aspose.slides.internal.c8m.j8 var9 = var8.l6();
               if (var9 != null) {
                  IAudio var10 = null;
                  IAudio[] var11 = new IAudio[]{var10};
                  boolean var12 = var3.k5().tryGetValue(var9, var11);
                  var10 = var11[0];
                  if (var12) {
                     AudioFrame var13 = var0.l6(var10);
                     var13.n5().n5(0);
                     return var13;
                  }

                  var4 = var0.l6(var3.k5(var9));
               }
            }
         }

         if (var6.u9("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
            var5 = var6.u3("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }
      }

      if (var4 == null && !com.aspose.slides.ms.System.d1.n5(var5)) {
         com.aspose.slides.internal.c8m.r7 var15 = var3.k7().n5(var5);
         if (var15.h0() == 1) {
            var4 = var0.t2();

            try {
               com.aspose.slides.ms.System.r8 var16 = new com.aspose.slides.ms.System.r8(var15.n5());
               String var17 = var16.c8() ? var16.x8() : var16.l6();
               var4.setLinkPathLong(var17);
            } catch (RuntimeException var14) {
               var4.setLinkPathLong(var15.n5());
               com.aspose.slides.internal.n8e.v4.n5(var14);
            }
         } else if (var15.l6() != null) {
            var4 = var0.l6(var3.k5(var15.l6()));
         }
      }

      if (var4 == null) {
         return null;
      }

      if (var6 != null) {
         n5(var4, var6, var3);
      }

      return var4;
   }

   private static void n5(VideoFrame var0, com.aspose.slides.ms.System.Xml.m8 var1, t5w var2) {
      com.aspose.slides.ms.System.Xml.x5 var3 = new com.aspose.slides.ms.System.Xml.x5(var1);
      var3.u9();
      com.aspose.slides.internal.k4y.h8v var4 = new com.aspose.slides.internal.k4y.h8v(var3);
      com.aspose.slides.internal.k4y.y4o var5 = var4.u3();
      if (var5 != null) {
         float var6 = 0.0F;
         float[] var7 = new float[]{0.0F};
         boolean var8 = com.aspose.slides.ms.System.n1.n5(var5.n5(), 511, com.aspose.slides.internal.x7n.l6.k5(), var7);
         var6 = var7[0];
         if (var8) {
            var0.setTrimFromStart(var6);
         }

         float var9 = 0.0F;
         float[] var10 = new float[]{0.0F};
         boolean var11 = com.aspose.slides.ms.System.n1.n5(var5.l6(), 511, com.aspose.slides.internal.x7n.l6.k5(), var10);
         var9 = var10[0];
         if (var11) {
            var0.setTrimFromEnd(var9);
         }
      }

      n5((CaptionsCollection)var0.getCaptionTracks(), var4, var2);
   }

   static void n5(CaptionsCollection var0, com.aspose.slides.internal.k4y.h8v var1, t5w var2) {
      com.aspose.slides.internal.k4y.n2u var3 = n5(var1.u9());
      if (var3 != null) {
         for (com.aspose.slides.internal.k4y.q3h var7 : var3.l6().n5()) {
            String var8 = var7.k5();
            if (var8 != null && !var8.isEmpty()) {
               com.aspose.slides.internal.c8m.r7 var9 = var2.k7().n5(var8);
               if (var9 != null) {
                  n4 var10 = var2.a6(var9.l6());
                  if (var10 != null) {
                     var0.n5(var7.n5(), var7.l6(), var10);
                  }
               }
            }
         }
      }
   }

   static void n5(VideoFrame var0, com.aspose.slides.internal.k4y.n7n var1, g6c var2) {
      com.aspose.slides.internal.k4y.d3 var3 = n5(var0);
      o3g.n5(var0, var1, var2);
      boolean var4 = !com.aspose.slides.ms.System.d1.n5(var0.getLinkPathLong());
      if (var4 || var0.getEmbeddedVideo() != null) {
         if (var0.getEmbeddedVideo() == null && com.aspose.slides.internal.z0k.u9.k5(var0.getLinkPathLong())) {
            var0.setEmbeddedVideo(((VideoCollection)var2.t2().getVideos()).n5(com.aspose.slides.internal.z0k.u9.h0(var0.getLinkPathLong()), null, null));
            var4 = false;
         }

         com.aspose.slides.internal.k4y.z8m var5 = (com.aspose.slides.internal.k4y.z8m)var1.n5().k5().n5("videoFile").l6();
         com.aspose.slides.internal.c8m.r7 var6 = var2.u6()
            .n5(
               com.aspose.slides.internal.c8m.r0.n5.n5(),
               var4 ? com.aspose.slides.internal.n8e.v4.n5(var0.getLinkPathLong()) : var2.n5(var0.getEmbeddedVideo()).l6(),
               (byte)(var4 ? 1 : -1)
            );
         var5.n5(var6.a6());
      }

      if (var3 != null) {
         n5(var0, var3, var4, var2);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0.getSlide(), ISlide.class)) {
         Slide var16 = (Slide)var0.getSlide();
         long var7 = o5.n5(var16);
         if (var16.q0().n5() == null) {
            var16.q0().n5(new com.aspose.slides.internal.k4y.k8g());
         }

         com.aspose.slides.internal.k4y.h7e var9 = var16.q0().n5().k5();
         if (var9 == null) {
            var9 = var16.q0().n5().n5();
         }

         com.aspose.slides.internal.k4y.u3l var10 = null;
         com.aspose.slides.internal.k4y.g7[] var11 = q3f.n5(var9, var0);

         for (com.aspose.slides.internal.k4y.g7 var15 : var11) {
            if (com.aspose.slides.internal.v6g.k5.l6(var15.l6(), com.aspose.slides.internal.k4y.u3l.class)) {
               var10 = (com.aspose.slides.internal.k4y.u3l)var15.l6();
               break;
            }
         }

         if (var10 == null) {
            var10 = (com.aspose.slides.internal.k4y.u3l)var9.n5("video").l6();
         }

         o5f.n5(var10, var0, (int)(++var7), var0.v4());
      }
   }

   private static void n5(VideoFrame var0, com.aspose.slides.internal.k4y.d3 var1, boolean var2, g6c var3) {
      com.aspose.slides.ms.System.Xml.m8 var4 = (com.aspose.slides.ms.System.Xml.m8)j2z.n5(
         var1.l6().getDocumentElement(), "media", "http://schemas.microsoft.com/office/powerpoint/2010/main"
      );
      if (var4 != null) {
         com.aspose.slides.ms.System.Xml.x5 var5 = new com.aspose.slides.ms.System.Xml.x5(var4);
         var5.u9();
         com.aspose.slides.internal.k4y.h8v var6 = new com.aspose.slides.internal.k4y.h8v(var5);
         n5(var0, var6, var3);
         n5(var0, var6, var2, var3);
         if (var0.getTrimFromStart() == 0.0F && var0.getTrimFromEnd() == 0.0F) {
            var6.n5((com.aspose.slides.internal.k4y.y4o)null);
         } else {
            com.aspose.slides.internal.k4y.y4o var7 = var6.u3();
            if (var7 == null) {
               var7 = var6.n5();
            }

            com.aspose.slides.internal.k4y.y4o var8 = var7;
            var8.n5(com.aspose.slides.ms.System.n1.n5(var0.getTrimFromStart(), com.aspose.slides.internal.x7n.l6.k5()));
            var8.l6(com.aspose.slides.ms.System.n1.n5(var0.getTrimFromEnd(), com.aspose.slides.internal.x7n.l6.k5()));
         }

         n5(var0.getCaptionTracks(), var6, var3);
         var1.l6().getDocumentElement().setInnerXml(n5("media", var6));
      }
   }

   static void n5(ICaptionsCollection var0, com.aspose.slides.internal.k4y.h8v var1, g6c var2) {
      com.aspose.slides.internal.k4y.x8 var3 = var1.u9();
      if (var0.getCount() == 0) {
         if (var3 != null) {
            com.aspose.slides.internal.k4y.b2l var14 = com.aspose.slides.internal.k4y.i8w.l6(var3, "{3AFAAA56-56D3-431D-BCD4-E75A35582382}");
            if (var14 != null) {
               var14.n5("");
            }
         }
      } else {
         com.aspose.slides.internal.k4y.n2u var4 = new com.aspose.slides.internal.k4y.n2u();
         var4.n5(1);
         com.aspose.slides.internal.k4y.y2t var5 = var4.n5();
         IGenericEnumerator var6 = var0.iterator();

         try {
            while (var6.hasNext()) {
               Captions var7 = (Captions)var6.next();
               com.aspose.slides.internal.c8m.j8 var8 = var2.n5(var7.k5());
               com.aspose.slides.internal.c8m.r7 var9 = var2.u6().l6(var8);
               com.aspose.slides.internal.k4y.q3h var10 = new com.aspose.slides.internal.k4y.q3h();
               var10.n5(var7.n5().k5());
               var10.k5(var9.a6());
               var10.n5(var7.getLabel());
               var10.l6(var7.l6());
               var5.n5(var10);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         var4.n5(var5);
         com.aspose.slides.internal.k4y.b2l var15 = new com.aspose.slides.internal.k4y.b2l();
         var15.n5(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "<p:ext uri=\"", "{3AFAAA56-56D3-431D-BCD4-E75A35582382}", "\" xmlns:p=\"http://schemas.openxmlformats.org/presentationml/2006/main\"></p:ext>"
            })
         );
         var15.l6().getDocumentElement().setInnerXml(n5("tracksInfo", var4));
         com.aspose.slides.internal.k4y.x8 var16 = var3;
         if (var16 == null) {
            var16 = var1.k5();
         }

         com.aspose.slides.internal.k4y.i8w.n5(var15, var16, "{3AFAAA56-56D3-431D-BCD4-E75A35582382}");
      }
   }

   private static void n5(VideoFrame var0, com.aspose.slides.internal.k4y.h8v var1, g6c var2) {
      if (var0.getEmbeddedVideo() != null) {
         com.aspose.slides.internal.c8m.r7 var3 = var2.u6()
            .n5("http://schemas.microsoft.com/office/2007/relationships/media", var2.n5(var0.getEmbeddedVideo()).l6(), (byte)-1);
         var1.n5(var3.a6());
      } else {
         var1.n5("");
      }
   }

   private static void n5(VideoFrame var0, com.aspose.slides.internal.k4y.h8v var1, boolean var2, g6c var3) {
      if (var2) {
         com.aspose.slides.internal.c8m.r7 var4 = var3.u6()
            .n5("http://schemas.microsoft.com/office/2007/relationships/media", com.aspose.slides.internal.n8e.v4.n5(var0.getLinkPathLong()), (byte)1);
         var1.l6(var4.a6());
      } else {
         var1.l6("");
      }
   }

   private static com.aspose.slides.internal.k4y.d3 n5(VideoFrame var0) {
      o5o var1 = var0.n5();
      if (var1.k7() == null) {
         var1.u9(new com.aspose.slides.internal.k4y.y1g());
      }

      com.aspose.slides.internal.k4y.d3 var2 = com.aspose.slides.internal.k4y.i8w.l6(var1.k7(), "{DAA4B4D4-6D71-4841-9C94-3DE7FCFB9230}");
      if (var2 == null && var0.k5()) {
         var2 = com.aspose.slides.internal.k4y.i8w.k5(var1.k7(), "{DAA4B4D4-6D71-4841-9C94-3DE7FCFB9230}");
         j2z.n5(var2.l6().getDocumentElement(), "p14", "media", "http://schemas.microsoft.com/office/powerpoint/2010/main");
      }

      return var2;
   }

   private static com.aspose.slides.internal.k4y.n2u n5(com.aspose.slides.internal.k4y.x8 var0) {
      if (var0 != null && var0.n5().length != 0) {
         com.aspose.slides.ms.System.Xml.m8 var1 = com.aspose.slides.internal.k4y.i8w.n5(var0, "{3AFAAA56-56D3-431D-BCD4-E75A35582382}").getDocumentElement();
         if (var1 == null) {
            return null;
         }

         com.aspose.slides.ms.System.Xml.m8 var2 = (com.aspose.slides.ms.System.Xml.m8)j2z.n5(
            var1, "tracksInfo", "http://schemas.microsoft.com/office/powerpoint/2017/3/main"
         );
         if (var2 == null) {
            return null;
         }

         com.aspose.slides.ms.System.Xml.x5 var3 = new com.aspose.slides.ms.System.Xml.x5(var2);
         var3.u9();
         return new com.aspose.slides.internal.k4y.n2u(var3);
      } else {
         return null;
      }
   }

   static String n5(String var0, com.aspose.slides.internal.k4y.b3 var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      com.aspose.slides.internal.z0k.r4 var3 = new com.aspose.slides.internal.z0k.r4(var2);

      try {
         com.aspose.slides.internal.n8e.u4 var4 = new com.aspose.slides.internal.n8e.u4(var3);

         try {
            var1.n5("", var4, var0);
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }

         var3.k5();
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      return var2.toString();
   }
}

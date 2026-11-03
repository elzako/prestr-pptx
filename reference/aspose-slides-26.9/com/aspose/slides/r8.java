package com.aspose.slides;

class r8 {
   public static final float[] n5 = new float[]{0.0F, 20.0F, 50.0F, 80.0F};

   static IAudioFrame n5(IGroupShape var0, com.aspose.slides.internal.k4y.e1 var1) {
      AudioFrame var2 = ((ShapeCollection)var0.getShapes()).s7();
      var2.setAudioCdStartTrack(var1.n5().n5() & 255);
      var2.setAudioCdStartTrackTime((int)var1.n5().l6());
      var2.setAudioCdEndTrack(var1.l6().n5() & 255);
      var2.setAudioCdEndTrackTime((int)var1.l6().l6());
      return var2;
   }

   static IAudioFrame n5(IGroupShape var0, com.aspose.slides.internal.k4y.x7n var1, t5w var2) {
      AudioFrame var3 = null;
      String var4 = var1.n5();
      if (var4 != null && var4.length() > 0) {
         com.aspose.slides.internal.c8m.r7 var5 = var2.k7().n5(var4);
         if (com.aspose.slides.ms.System.d1.a6("NULL", var5.n5())) {
            var3 = ((ShapeCollection)var0.getShapes()).l6((IAudio)null);
         } else {
            var3 = ((ShapeCollection)var0.getShapes()).l6(var2.l6(var5.l6()));
         }
      }

      return var3;
   }

   static IAudioFrame n5(IGroupShape var0, com.aspose.slides.internal.k4y.z1 var1, com.aspose.slides.internal.k4y.g0 var2, t5w var3) {
      AudioFrame var4 = null;
      String var5 = var2.n5();
      ShapeCollection var6 = (ShapeCollection)var0.getShapes();
      com.aspose.slides.ms.System.Xml.m8 var7 = n5(var1.n5().k5().c8());
      if (var7 != null) {
         if (var7.u9("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
            String var8 = var7.u3("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            if (var8 != null && var8.length() > 0) {
               com.aspose.slides.internal.c8m.r7 var9 = var3.k7().n5(var8);
               var4 = var6.l6(var3.l6(var9.l6()));
               var4.n5().n5(0);
            }
         }

         if (var7.u9("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
            var5 = var7.u3("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }
      }

      if (var4 == null && var5 != null && var5.length() > 0) {
         com.aspose.slides.internal.c8m.r7 var12 = var3.k7().n5(var5);
         if (com.aspose.slides.ms.System.d1.a6("NULL", var12.n5())) {
            var4 = var6.l6((IAudio)null);
         } else if (var12.h0() == 1) {
            try {
               com.aspose.slides.ms.System.r8 var13 = new com.aspose.slides.ms.System.r8(var12.n5());
               String var10 = var13.c8() ? var13.x8() : var13.l6();
               var4 = var6.k5(var10);
            } catch (RuntimeException var11) {
               var4 = var6.k5(var12.n5());
               com.aspose.slides.internal.n8e.v4.n5(var11);
            }
         } else if (var12.l6() != null) {
            var4 = var6.l6(var3.l6(var12.l6()));
            var4.n5().n5(0);
         }
      }

      if (var4 != null && var7 != null) {
         n5(var4, var7, var3);
      }

      return var4;
   }

   static com.aspose.slides.ms.System.Xml.m8 n5(com.aspose.slides.internal.k4y.x8 var0) {
      if (var0 != null && var0.n5().length != 0) {
         com.aspose.slides.ms.System.Xml.m8 var1 = com.aspose.slides.internal.k4y.i8w.n5(var0, "{DAA4B4D4-6D71-4841-9C94-3DE7FCFB9230}").getDocumentElement();
         return var1 != null ? (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var1, "media", "http://schemas.microsoft.com/office/powerpoint/2010/main") : null;
      } else {
         return null;
      }
   }

   static com.aspose.slides.internal.k4y.x8 n5(u9i var0) {
      com.aspose.slides.internal.k4y.x8 var1 = var0.k7();
      if (var1 == null) {
         var1 = new com.aspose.slides.internal.k4y.y1g();
         com.aspose.slides.internal.k4y.d3 var2 = com.aspose.slides.internal.k4y.i8w.k5(var1, "{DAA4B4D4-6D71-4841-9C94-3DE7FCFB9230}");
         com.aspose.slides.ms.System.Xml.m8 var3 = (com.aspose.slides.ms.System.Xml.m8)j2z.n5(
            var2.l6().getDocumentElement(), "p14", "media", "http://schemas.microsoft.com/office/powerpoint/2010/main"
         );
         com.aspose.slides.ms.System.Xml.u8 var4 = var2.l6()
            .createAttribute("r", "embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         var3.getAttributes().l6(var4);
      }

      return var1;
   }

   private static void n5(IAudioFrame var0, com.aspose.slides.ms.System.Xml.m8 var1, t5w var2) {
      com.aspose.slides.ms.System.Xml.x5 var3 = new com.aspose.slides.ms.System.Xml.x5(var1);
      var3.u9();
      com.aspose.slides.internal.k4y.h8v var4 = new com.aspose.slides.internal.k4y.h8v(var3);
      com.aspose.slides.internal.k4y.e9h var5 = var4.a6();
      if (var5 != null) {
         float var6 = 0.0F;
         float[] var7 = new float[]{0.0F};
         boolean var8 = com.aspose.slides.ms.System.n1.n5(var5.n5(), 511, com.aspose.slides.internal.x7n.l6.k5(), var7);
         var6 = var7[0];
         if (var8) {
            var0.setFadeInDuration(var6);
         }

         float var9 = 0.0F;
         float[] var10 = new float[]{0.0F};
         boolean var11 = com.aspose.slides.ms.System.n1.n5(var5.l6(), 511, com.aspose.slides.internal.x7n.l6.k5(), var10);
         var9 = var10[0];
         if (var11) {
            var0.setFadeOutDuration(var9);
         }
      }

      com.aspose.slides.internal.k4y.y4o var14 = var4.u3();
      if (var14 != null) {
         float var15 = 0.0F;
         float[] var17 = new float[]{0.0F};
         boolean var19 = com.aspose.slides.ms.System.n1.n5(var14.n5(), 511, com.aspose.slides.internal.x7n.l6.k5(), var17);
         var15 = var17[0];
         if (var19) {
            var0.setTrimFromStart(var15);
         }

         float var20 = 0.0F;
         float[] var22 = new float[]{0.0F};
         boolean var12 = com.aspose.slides.ms.System.n1.n5(var14.l6(), 511, com.aspose.slides.internal.x7n.l6.k5(), var22);
         var20 = var22[0];
         if (var12) {
            var0.setTrimFromEnd(var20);
         }
      }

      m0y.n5((CaptionsCollection)var0.getCaptionTracks(), var4, var2);
   }

   static void n5(AudioFrame var0, com.aspose.slides.internal.k4y.n7n var1, g6c var2) {
      r1 var3 = var0.n5();
      if (var3.k7() == null) {
         var3.u9(new com.aspose.slides.internal.k4y.y1g());
      }

      com.aspose.slides.internal.k4y.d3 var4 = com.aspose.slides.internal.k4y.i8w.l6(var3.k7(), "{DAA4B4D4-6D71-4841-9C94-3DE7FCFB9230}");
      if (var4 == null && var0.k5()) {
         var4 = com.aspose.slides.internal.k4y.i8w.k5(var3.k7(), "{DAA4B4D4-6D71-4841-9C94-3DE7FCFB9230}");
         j2z.n5(var4.l6().getDocumentElement(), "p14", "media", "http://schemas.microsoft.com/office/powerpoint/2010/main");
      }

      com.aspose.slides.ms.System.Xml.m8 var5 = var4 == null
         ? null
         : (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var4.l6().getDocumentElement(), "media", "http://schemas.microsoft.com/office/powerpoint/2010/main");
      o3g.n5(var0, var1, var2);
      if (var3.n5() != 2) {
         if (var0.getEmbeddedAudio() != null
            && (var0.getEmbeddedAudio() == null || "audio/wav".equals(var0.getEmbeddedAudio().getContentType()) && var5 == null)) {
            var3.n5(1);
         } else {
            var3.n5(0);
         }
      }

      var1.n5().k5().n5((com.aspose.slides.internal.k4y.g7)null);
      switch (var3.n5()) {
         case 0:
            com.aspose.slides.internal.k4y.g0 var7 = (com.aspose.slides.internal.k4y.g0)var1.n5().k5().n5("audioFile").l6();
            com.aspose.slides.internal.c8m.r7 var9;
            if (var0.getEmbeddedAudio() != null) {
               com.aspose.slides.internal.c8m.j8 var19 = var2.n5(var0.getEmbeddedAudio());
               if (var19.y4().l6().n5() == null) {
                  var9 = var2.u6().n5("http://schemas.microsoft.com/office/2007/relationships/media", var19.l6());
               } else {
                  var9 = var2.u6().l6(var19);
               }
            } else if (var0.getEmbeddedAudio() == null) {
               var9 = var2.u6().n5(com.aspose.slides.internal.c8m.u9.n5.n5(), "NULL");
            } else {
               var9 = var2.u6().n5(com.aspose.slides.internal.c8m.u9.n5.n5(), com.aspose.slides.internal.n8e.v4.n5(var0.getLinkPathLong()), (byte)1);
            }

            var7.n5(var9.a6());
            if (var4 != null) {
               n5(var0, var4, var2);
            }
            break;
         case 1:
         default:
            com.aspose.slides.internal.k4y.x7n var8 = (com.aspose.slides.internal.k4y.x7n)var1.n5().k5().n5("wavAudioFile").l6();
            com.aspose.slides.internal.c8m.r7 var10 = var2.u6().l6(var2.n5(var0.getEmbeddedAudio()));
            var8.n5(var10.a6());
            break;
         case 2:
            com.aspose.slides.internal.k4y.e1 var6 = (com.aspose.slides.internal.k4y.e1)var1.n5().k5().n5("audioCd").l6();
            var6.n5().n5((byte)var0.getAudioCdStartTrack());
            var6.n5().n5(var0.getAudioCdStartTrackTime() & 4294967295L);
            var6.l6().n5((byte)var0.getAudioCdEndTrack());
            var6.l6().n5(var0.getAudioCdEndTrackTime() & 4294967295L);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0.getSlide(), ISlide.class)) {
         Slide var18 = (Slide)var0.getSlide();
         long var11 = o5.n5(var18);
         if (var18.q0().n5() == null) {
            var18.q0().n5(new com.aspose.slides.internal.k4y.k8g());
         }

         com.aspose.slides.internal.k4y.h7e var20 = var18.q0().n5().k5();
         if (var20 == null) {
            var20 = var18.q0().n5().n5();
         }

         com.aspose.slides.internal.k4y.e3b var21 = null;
         com.aspose.slides.internal.k4y.g7[] var13 = q3f.n5(var20, var0);

         for (com.aspose.slides.internal.k4y.g7 var17 : var13) {
            if (com.aspose.slides.internal.v6g.k5.l6(var17.l6(), com.aspose.slides.internal.k4y.e3b.class)) {
               var21 = (com.aspose.slides.internal.k4y.e3b)var17.l6();
               break;
            }
         }

         if (var21 == null) {
            var21 = (com.aspose.slides.internal.k4y.e3b)var20.n5("audio").l6();
         }

         o5f.n5(var21, var0, (int)(++var11), var0.v4());
      }
   }

   private static void n5(AudioFrame var0, com.aspose.slides.internal.k4y.d3 var1, g6c var2) {
      com.aspose.slides.ms.System.Xml.m8 var3 = (com.aspose.slides.ms.System.Xml.m8)j2z.n5(
         var1.l6().getDocumentElement(), "media", "http://schemas.microsoft.com/office/powerpoint/2010/main"
      );
      if (var3 != null) {
         com.aspose.slides.ms.System.Xml.x5 var4 = new com.aspose.slides.ms.System.Xml.x5(var3);
         var4.u9();
         com.aspose.slides.internal.k4y.h8v var5 = new com.aspose.slides.internal.k4y.h8v(var4);
         n5(var0, var5, var2);
         if (var0.getFadeInDuration() == 0.0F && var0.getFadeOutDuration() == 0.0F) {
            var5.n5((com.aspose.slides.internal.k4y.e9h)null);
         } else {
            com.aspose.slides.internal.k4y.e9h var6 = var5.a6();
            if (var6 == null) {
               var6 = var5.l6();
            }

            com.aspose.slides.internal.k4y.e9h var7 = var6;
            var7.n5(com.aspose.slides.ms.System.n1.n5(var0.getFadeInDuration(), com.aspose.slides.internal.x7n.l6.k5()));
            var7.l6(com.aspose.slides.ms.System.n1.n5(var0.getFadeOutDuration(), com.aspose.slides.internal.x7n.l6.k5()));
         }

         if (var0.getTrimFromStart() == 0.0F && var0.getTrimFromEnd() == 0.0F) {
            var5.n5((com.aspose.slides.internal.k4y.y4o)null);
         } else {
            com.aspose.slides.internal.k4y.y4o var8 = var5.u3();
            if (var8 == null) {
               var8 = var5.n5();
            }

            com.aspose.slides.internal.k4y.y4o var9 = var8;
            var9.n5(com.aspose.slides.ms.System.n1.n5(var0.getTrimFromStart(), com.aspose.slides.internal.x7n.l6.k5()));
            var9.l6(com.aspose.slides.ms.System.n1.n5(var0.getTrimFromEnd(), com.aspose.slides.internal.x7n.l6.k5()));
         }

         m0y.n5(var0.getCaptionTracks(), var5, var2);
         var1.l6().getDocumentElement().setInnerXml(m0y.n5("media", var5));
      }
   }

   private static void n5(AudioFrame var0, com.aspose.slides.internal.k4y.h8v var1, g6c var2) {
      if (var0.getEmbeddedAudio() == null) {
         var1.n5("");
      } else {
         com.aspose.slides.internal.c8m.r7 var3 = var2.u6()
            .n5("http://schemas.microsoft.com/office/2007/relationships/media", var2.n5(var0.getEmbeddedAudio()).l6(), (byte)0);
         var1.n5(var3.a6());
      }

      if (var0.getLinkPathLong() != null && !var0.getLinkPathLong().isEmpty()) {
         com.aspose.slides.internal.c8m.r7 var4 = var2.u6()
            .n5("http://schemas.microsoft.com/office/2007/relationships/media", com.aspose.slides.internal.n8e.v4.n5(var0.getLinkPathLong()), (byte)1);
         var1.l6(var4.a6());
      } else {
         var1.l6("");
      }
   }
}

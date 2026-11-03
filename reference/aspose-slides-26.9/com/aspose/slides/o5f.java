package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class o5f {
   public static void n5(Sequence var0, Effect var1, com.aspose.slides.internal.k4y.o2n var2, d5t var3, com.aspose.slides.internal.k4y.h7e var4) {
      com.aspose.slides.internal.k4y.h7e var5 = var2.n5().d5();
      if (var1.getSound() != null) {
         n5(var5);
      } else if (var1.getStopPreviousSound()) {
         n5(var5, (byte)0, "onstopaudio");
      }

      n5(var1, var2, var3);
      if (var1.getPresetClassType() == 4) {
         n5(var0, var1, var4);
      }
   }

   static void n5(com.aspose.slides.internal.k4y.h7e var0) {
      com.aspose.slides.internal.k4y.e3b var1 = (com.aspose.slides.internal.k4y.e3b)var0.n5("audio").l6();
      var1.l6().a6().a6((byte)0);
      var1.l6().a6().u3((byte)0);
      com.aspose.slides.internal.k4y.d1x var2 = var1.l6().a6().n5().n5();
      var2.n5((byte)2);
      var2.l6("0");
      var2.n5("tn");
      com.aspose.slides.internal.k4y.d1x var3 = var1.l6().a6().l6().n5();
      var3.n5((byte)10);
      var3.l6("0");
      com.aspose.slides.internal.k4y.s2a var4 = (com.aspose.slides.internal.k4y.s2a)var3.n5("tgtEl").l6();
      var4.n5("sldTgt");
      var1.l6().u9().n5("sndTgt");
   }

   static void n5(com.aspose.slides.internal.k4y.h7e var0, byte var1, String var2) {
      com.aspose.slides.internal.k4y.s1z var3 = (com.aspose.slides.internal.k4y.s1z)var0.n5("cmd").l6();
      var3.n5(var1);
      var3.n5(var2);
      var3.k5().u9().a6((byte)0);
      var3.k5().u9().u3((byte)0);
      com.aspose.slides.internal.k4y.d1x var4 = var3.k5().u9().n5().n5();
      var4.n5((byte)2);
      var4.l6("0");
      var4.n5("tn");
      var3.k5().h0().n5("sldTgt");
   }

   private static void n5(Effect var0, com.aspose.slides.internal.k4y.o2n var1, d5t var2) {
      List$Enumerator var3 = var1.n5().d5().n5().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var4.l6(), com.aspose.slides.internal.k4y.e3b.class)) {
               n5((com.aspose.slides.internal.k4y.e3b)var4.l6(), var0, var1, var2);
            } else {
               com.aspose.slides.internal.k4y.p2j var5 = com.aspose.slides.internal.v6g.k5.n5(var4.l6(), com.aspose.slides.internal.k4y.p2j.class);
               if (var5 != null) {
                  n5(var5.l6(), var1);
               } else {
                  com.aspose.slides.internal.k4y.s1z var6 = com.aspose.slides.internal.v6g.k5.n5(var4.l6(), com.aspose.slides.internal.k4y.s1z.class);
                  if (var6 != null) {
                     n5(var6.k5(), var1);
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.e3b var0, Effect var1, com.aspose.slides.internal.k4y.o2n var2, d5t var3) {
      if (var0 != null && var0.l6().a6().c4() != null) {
         for (com.aspose.slides.internal.k4y.d1x var7 : var0.l6().a6().c4().l6()) {
            if (var7.n5() == 2 && var7.k5() != null) {
               com.aspose.slides.internal.k4y.i1s var8 = com.aspose.slides.internal.v6g.k5.n5(var7.k5().l6(), com.aspose.slides.internal.k4y.i1s.class);
               var8.n5(var2.n5().u9());
               break;
            }
         }

         if (var0.l6().u9() != null) {
            com.aspose.slides.internal.k4y.x7n var9 = com.aspose.slides.internal.v6g.k5.n5(var0.l6().u9().n5().l6(), com.aspose.slides.internal.k4y.x7n.class);
            if (var9 != null) {
               if (var1.getSound() != null) {
                  var9.l6(((Audio)var1.getSound()).n5().n5());
                  com.aspose.slides.internal.c8m.j8 var10 = var3.n5(var1.getSound());
                  if (var10 != null) {
                     var9.n5(var3.n5(var10).a6());
                     if (com.aspose.slides.ms.System.d1.n5(var9.l6())) {
                        var9.l6(com.aspose.slides.ms.System.d1.n5(var10.k5(), "ppt/media/", ""));
                     }
                  } else {
                     int var12 = var3.l6(var1.getSound());
                     if (var12 > 0) {
                        var9.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"", com.aspose.slides.ms.System.a3.l6(var12)}));
                     }
                  }
               } else {
                  com.aspose.slides.internal.c8m.r7 var11 = var3.n5(com.aspose.slides.internal.c8m.a6.n5.n5());
                  if (var11 != null) {
                     var9.n5(var11.a6());
                  }
               }
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.u2q var0, com.aspose.slides.internal.k4y.o2n var1) {
      if (var0 != null && var0.u9() != null && var0.u9().c4() != null) {
         for (com.aspose.slides.internal.k4y.d1x var5 : var0.u9().c4().l6()) {
            if (var5.k5() != null) {
               com.aspose.slides.internal.k4y.i1s var6 = com.aspose.slides.internal.v6g.k5.n5(var5.k5().l6(), com.aspose.slides.internal.k4y.i1s.class);
               if (var6 != null) {
                  var6.n5(var1.n5().u9());
               }
            }
         }
      }
   }

   private static void n5(Sequence var0, Effect var1, com.aspose.slides.internal.k4y.h7e var2) {
      IShape var3 = var1.k5().u3();
      if (com.aspose.slides.internal.v6g.k5.l6(var3, IAudioFrame.class) || com.aspose.slides.internal.v6g.k5.l6(var3, IVideoFrame.class)) {
         com.aspose.slides.internal.k4y.g7[] var4 = q3f.n5(var2, var3);

         for (com.aspose.slides.internal.k4y.g7 var8 : var4) {
            if ("audio".equals(var8.n5()) || "video".equals(var8.n5())) {
               return;
            }
         }

         com.aspose.slides.internal.k4y.e3b var16 = null;
         com.aspose.slides.internal.k4y.u3l var17 = null;
         com.aspose.slides.internal.k4y.h7e var18 = ((BaseSlide)var3.getSlide()).k5().n5().k5();
         if (var18 != null) {
            var4 = q3f.n5(var18, var3);

            for (com.aspose.slides.internal.k4y.g7 var11 : var4) {
               if ("audio".equals(var11.n5())) {
                  var16 = (com.aspose.slides.internal.k4y.e3b)var11.l6();
                  var2.n5(var11);
               } else if ("video".equals(var11.n5())) {
                  var17 = (com.aspose.slides.internal.k4y.u3l)var11.l6();
                  var2.n5(var11);
               }
            }
         }

         long var12 = o5.l6(var3);
         IAudioFrame var20 = com.aspose.slides.internal.v6g.k5.n5(var3, IAudioFrame.class);
         if (var20 != null) {
            if (var16 == null) {
               var16 = (com.aspose.slides.internal.k4y.e3b)var2.n5("audio").l6();
            }

            int var21 = var0.n5().l6() + 1;
            var0.n5().n5(var21);
            n5(var16, var20, var21, var12, var1.getTiming());
         } else {
            IVideoFrame var22 = (IVideoFrame)var3;
            if (var17 == null) {
               var17 = (com.aspose.slides.internal.k4y.u3l)var2.n5("video").l6();
            }

            int var14 = var0.n5().l6() + 1;
            var0.n5().n5(var14);
            n5(var17, var22, var14, var12, var1.getTiming());
         }
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.e3b var0, IAudioFrame var1, int var2, long var3) {
      n5(var0, var1, var2, var3, null);
   }

   public static void n5(com.aspose.slides.internal.k4y.e3b var0, IAudioFrame var1, int var2, long var3, ITiming var5) {
      com.aspose.slides.internal.k4y.c7e var6 = var0.l6();
      n5(var6, var2, var3, !var1.getHideAtShowing(), true);
      var6.a6().k5((byte)(((AudioFrame)var1).getRewindAudio() ? 0 : 2));
      if (!var1.getPlayAcrossSlides()) {
         var6.n5(1L);
      } else if ((var6.k5() & 4294967295L) < 2L) {
         var6.n5(999L);
      }

      if (var1.getVolume() == 0) {
         var6.n5(true);
      }

      var6.n5(var1.getVolumeValue());
      if (var5 != null && !var1.getPlayLoopMode()) {
         var6.a6().l6(o5.n5(var5.getRepeatCount()));
      } else {
         var6.a6().l6(o5.n5(var1.getPlayLoopMode() ? Float.POSITIVE_INFINITY : 1.0F));
      }

      var0.n5(com.aspose.slides.internal.v6g.k5.n5(var1, AudioFrame.class).n5().l6());
   }

   public static void n5(com.aspose.slides.internal.k4y.u3l var0, IVideoFrame var1, int var2, long var3) {
      n5(var0, var1, var2, var3, null);
   }

   public static void n5(com.aspose.slides.internal.k4y.u3l var0, IVideoFrame var1, int var2, long var3, ITiming var5) {
      var0.n5(var1.getFullScreenMode());
      com.aspose.slides.internal.k4y.c7e var6 = var0.l6();
      n5(var6, var2, var3, !var1.getHideAtShowing(), false);
      if (((VideoFrame)var1).n5().n5() == 2) {
         var0.l6().n5(999L);
      }

      if (var1.getVolume() == 0) {
         var0.l6().n5(true);
      }

      var0.l6().n5(q3f.n5(var1.getVolume()) * 100.0F);
      var0.l6().a6().k5((byte)(var1.getRewindVideo() ? 0 : 2));
      if (var5 != null && !var1.getPlayLoopMode()) {
         var0.l6().a6().l6(o5.n5(var5.getRepeatCount()));
      } else {
         var0.l6().a6().l6(o5.n5(var1.getPlayLoopMode() ? Float.POSITIVE_INFINITY : 1.0F));
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.c7e var0, int var1, long var2, boolean var4, boolean var5) {
      var0.a6().n5(var1);
      var0.a6().l6(0.0F);
      var0.a6().k5(0.0F);
      var0.a6().u3((byte)0);
      var0.l6(var4);
      if (var0.u9().n5() == null) {
         com.aspose.slides.internal.k4y.h1f var6 = (com.aspose.slides.internal.k4y.h1f)var0.u9().n5("spTgt").l6();
         var6.l6(com.aspose.slides.ms.System.Xml.f4.l6(var2));
      }

      if (var0.a6().c4() == null) {
         com.aspose.slides.internal.k4y.z2x var11 = var0.a6().n5();
         com.aspose.slides.internal.k4y.d1x var7 = var11.n5();
         var7.l6(o5.n5(Float.POSITIVE_INFINITY));
      }

      if (var5 && var0.a6().y2() == null) {
         com.aspose.slides.internal.k4y.z2x var12 = var0.a6().l6();
         com.aspose.slides.internal.k4y.d1x var13 = var12.n5();
         var13.l6(o5.n5(0.0F));
         com.aspose.slides.internal.k4y.s2a var8 = (com.aspose.slides.internal.k4y.s2a)var13.n5("tgtEl").l6();
         var8.n5("sldTgt");
         var13.n5((byte)9);
         com.aspose.slides.internal.k4y.d1x var9 = var12.n5();
         var9.l6(o5.n5(0.0F));
         com.aspose.slides.internal.k4y.s2a var10 = (com.aspose.slides.internal.k4y.s2a)var9.n5("tgtEl").l6();
         var10.n5("sldTgt");
         var9.n5((byte)10);
      }
   }
}

package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NullReferenceException;

class a7 extends t4s {
   static void n5(v5s var0) {
      l7d var1 = (l7d)var0.a6();
      if (var1.n5() == null) {
         throw new InvalidDataException("No linked object for AudioFrame!");
      }

      AudioFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), AudioFrame.class);
      if (var2 == null) {
         throw new NullReferenceException("AudioFrame isn't created!");
      }

      com.aspose.slides.internal.k0r.q5 var3 = com.aspose.slides.internal.v6g.k5.n5(var0.k5(), com.aspose.slides.internal.k0r.q5.class);
      k5(var0);
      com.aspose.slides.internal.k0r.n5 var4 = null;
      if (var3.s7().u9() != null) {
         var4 = var3.s7().u9().l6();
      }

      if (var4 != null) {
         var2.k5 = !var4.u3() ? 1 : 0;
      } else {
         var2.k5 = 1;
      }

      var2.setHyperlinkClick(Hyperlink.getMedia());
      var2.setVolume(3);
      switch (var1.n5().r4() & 65535) {
         case 4109:
            k5(var1);
            break;
         case 4110:
            u3(var1);
            break;
         case 4111:
            n5(var1);
            break;
         case 4112:
            l6(var1);
            break;
         default:
            throw new ArgumentOutOfRangeException("Unknown ExContainer for OleObjectFrame!");
      }
   }

   private static void n5(l7d var0) {
      com.aspose.slides.internal.k0r.a2 var1 = (com.aspose.slides.internal.k0r.a2)var0.n5();
      AudioFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var0.m1(), AudioFrame.class);
      d5f var3 = var0.y4().a6();
      n5(var1.l6(), var2);
      var2.l6 = "";
      var2.n5 = "";

      try {
         com.aspose.slides.internal.k0r.d0p var4 = var3.h0().s7();
         if (var4 != null) {
            com.aspose.slides.internal.k0r.x6s var5 = var4.n5((int)var1.u3().l6());
            if (var5.u9() != null) {
               var2.setEmbeddedAudio(var3.n5(var5));
            }
         }

         var2.n5().n5(1);
      } catch (RuntimeException var6) {
         com.aspose.slides.internal.n8e.v4.n5(var6);
      }
   }

   private static void l6(l7d var0) {
      com.aspose.slides.internal.k0r.h1 var1 = (com.aspose.slides.internal.k0r.h1)var0.n5();
      AudioFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var0.m1(), AudioFrame.class);
      n5(var1.l6(), var2);
      var2.setLinkPathLong(var1.u3() == null ? "" : var1.u3().l6());
      var2.n5().n5(0);
   }

   private static void k5(l7d var0) {
      com.aspose.slides.internal.k0r.l5 var1 = (com.aspose.slides.internal.k0r.l5)var0.n5();
      AudioFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var0.m1(), AudioFrame.class);
      n5(var1.l6(), var2);
      var2.setLinkPathLong(var1.u3() == null ? "" : var1.u3().l6());
      var2.n5().n5(0);
   }

   private static void u3(l7d var0) {
      com.aspose.slides.internal.k0r.w3 var1 = (com.aspose.slides.internal.k0r.w3)var0.n5();
      AudioFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var0.m1(), AudioFrame.class);
      n5(var1.l6(), var2);
      com.aspose.slides.internal.k0r.a1 var3 = var1.u3();
      var2.setAudioCdStartTrack(var3.l6() & 255);
      var2.setAudioCdStartTrackTime(var3.k5());
      var2.setAudioCdEndTrack(var3.u3() & 255);
      var2.setAudioCdEndTrackTime(var3.a6());
      var2.n5().n5(2);
   }

   private static void n5(com.aspose.slides.internal.k0r.u2 var0, AudioFrame var1) {
      var1.setPlayLoopMode(var0.k5());
      var1.setRewindAudio(var0.u3());
   }

   static void n5(AudioFrame var0, com.aspose.slides.internal.k0r.c5 var1, k1z var2) {
      com.aspose.slides.internal.k0r.q5 var3 = var2.z3();
      if (var3 != null) {
         com.aspose.slides.internal.k0r.c9 var4 = var3.s7();
         g6o var5 = var2.u3().a6().n5();
         com.aspose.slides.internal.k0r.d9 var6 = var1.l6();
         long var7 = var6.l6();
         var6.n5(var7 + 1L);
         long var9 = var7;
         switch (var0.n5().n5()) {
            case 0:
               com.aspose.slides.internal.k0r.h1 var12 = new com.aspose.slides.internal.k0r.h1();
               var1.e2().addItem(var12);
               n5(var0, var9, var12.l6());
               var12.u3().n5(var0.getLinkPathLong());
               break;
            case 1:
               com.aspose.slides.internal.k0r.a2 var11 = new com.aspose.slides.internal.k0r.a2();
               var1.e2().addItem(var11);
               n5(var0, var9, var11.l6());
               if (var0.getEmbeddedAudio() != null) {
                  var11.u3().n5(e0j.n5(var0.getEmbeddedAudio(), var5) & 4294967295L);
               }
         }

         com.aspose.slides.internal.k0r.t5 var14 = new com.aspose.slides.internal.k0r.t5();
         var14.n5((var1.l6().l6() & 4294967295L) - 1L & 4294967295L);
         var4.n5(var14);
         if (var0.k5 == 0) {
            com.aspose.slides.internal.k0r.l6 var15 = new com.aspose.slides.internal.k0r.l6();
            var4.n5(var15);
            com.aspose.slides.internal.k0r.n5 var13 = new com.aspose.slides.internal.k0r.n5();
            var15.e2().addItem(var13);
            var13.n5(new com.aspose.slides.internal.k0r.m1(6L, com.aspose.slides.internal.o9b.c8.m3().o8()));
            var13.n5(true);
            var13.k5(true);
            var13.u3(true);
            var13.n5(0L);
            var13.n5((short)var2.y1());
         }
      }
   }

   private static void n5(AudioFrame var0, long var1, com.aspose.slides.internal.k0r.u2 var3) {
      var3.n5(var1);
      var3.n5(var0.getPlayLoopMode());
      var3.l6(var0.getRewindAudio());
   }
}

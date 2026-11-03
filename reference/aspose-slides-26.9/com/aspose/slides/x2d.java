package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class x2d {
   private static final com.aspose.slides.internal.n8e.e2 n5 = new com.aspose.slides.internal.n8e.e2(
      0, true, "avi", "wmv", "mpg", "mpeg", "mp4", "mp2", "mpe", "mpv", "mkv", "flv", "swf", "webm", "mov", "qt", "avchd", "ogg"
   );
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("Loop", "Mute");

   public static IShape n5(ShapeCollection var0, com.aspose.slides.internal.k4y.b4f var1, com.aspose.slides.internal.k4y.h9p var2, z5q var3) {
      if (var0 == null) {
         throw new ArgumentNullException("shapes");
      }

      if (var2 == null) {
         throw new ArgumentNullException("pluginElement");
      }

      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var1.c8(), var1.t2(), var1.s7(), var1.x8()).y4();
      IAudioFrame var5 = null;
      IVideoFrame var6 = null;
      if (t2f.k5(var2.l6())) {
         com.aspose.slides.internal.c8m.z5 var7 = var3.l6(var2.l6());
         if (var2.k5() == 1 && var7 != null) {
            IAudio var13 = null;
            IVideo var9 = null;
            IVideo[] var10 = new IVideo[]{var9};
            IAudio[] var11 = new IAudio[]{var13};
            var3.n5(var7, var10, var11);
            var9 = var10[0];
            var13 = var11[0];
            if (var9 != null) {
               var6 = var0.addVideoFrame(var4.x8(), var4.n3(), var4.s7(), var4.k5(), var9);
            } else {
               var5 = var0.addAudioFrameEmbedded(var4.x8(), var4.n3(), var4.s7(), var4.k5(), var13);
            }
         } else {
            String var8;
            try {
               var8 = com.aspose.slides.ms.System.d1.k5(com.aspose.slides.internal.z0k.z1.a6(var2.l6()), 1);
            } catch (RuntimeException var12) {
               var8 = null;
            }

            if (var8 != null && n5.l6(var8)) {
               var6 = var0.addVideoFrame(var4.x8(), var4.n3(), var4.s7(), var4.k5(), var2.l6());
            } else {
               var5 = var0.addAudioFrameLinked(var4.x8(), var4.n3(), var4.s7(), var4.k5(), var2.l6());
            }
         }
      }

      if (var6 != null) {
         n5(var6, var2, var3);
         return var6;
      }

      if (var5 == null) {
         var5 = var0.l6((IAudio)null);
         var5.setFrame(new ShapeFrame(var4.x8(), var4.n3(), var4.s7(), var4.k5(), (byte)0, (byte)0, 0.0F));
      }

      n5(var5, var2, var3);
      return var5;
   }

   private static void n5(IVideoFrame var0, com.aspose.slides.internal.k4y.h9p var1, z5q var2) {
      com.aspose.slides.internal.o9b.t4 var3 = n5();

      try {
         var0.getPictureFormat().getPicture().setImage(((ImageCollection)var2.n5().getImages()).n5(var3));
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      var0.setVolume(2);

      for (com.aspose.slides.internal.k4y.t4i var7 : var1.u3()) {
         switch (l6.n5(var7.n5())) {
            case 0:
               var0.setPlayLoopMode(t2f.a6(var7.l6()) == 1);
               break;
            case 1:
               if (t2f.a6(var7.l6()) == 1) {
                  var0.setVolume(0);
               }
         }
      }
   }

   private static void n5(IAudioFrame var0, com.aspose.slides.internal.k4y.h9p var1, z5q var2) {
      com.aspose.slides.internal.o9b.t4 var3 = n5();

      try {
         var0.getPictureFormat().getPicture().setImage(((ImageCollection)var2.n5().getImages()).n5(var3));
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      var0.setVolume(2);

      for (com.aspose.slides.internal.k4y.t4i var7 : var1.u3()) {
         switch (l6.n5(var7.n5())) {
            case 0:
               var0.setPlayLoopMode(t2f.a6(var7.l6()) == 1);
               break;
            case 1:
               if (t2f.a6(var7.l6()) == 1) {
                  var0.setVolume(0);
               }
         }
      }
   }

   public static void n5(IAudioFrame var0, com.aspose.slides.internal.k4y.b4f var1, OdpSerializationContext var2) {
      if (var0 == null) {
         throw new ArgumentNullException("audioFrame");
      }

      if (var1 == null) {
         throw new ArgumentNullException("frameElement");
      }

      j4k.n5(var0, var1);
      com.aspose.slides.internal.k4y.h9p var3 = n5(var1);
      if (var0.getEmbeddedAudio() != null) {
         if (!var2.n3()) {
            var3.l6(var2.n5(var0.getEmbeddedAudio()));
            var3.l6(1);
         }
      } else {
         var3.l6(
            com.aspose.slides.ms.System.d1.n5(var0.getLinkPathLong())
               ? com.aspose.slides.ms.System.d1.n5
               : com.aspose.slides.internal.n8e.v4.n5(var0.getLinkPathLong())
         );
      }

      n5(var0.getPlayLoopMode(), var0.getVolume(), var3);
   }

   public static void n5(IVideoFrame var0, com.aspose.slides.internal.k4y.b4f var1, OdpSerializationContext var2) {
      if (var0 == null) {
         throw new ArgumentNullException("videoFrame");
      }

      if (var1 == null) {
         throw new ArgumentNullException("frameElement");
      }

      j4k.n5(var0, var1);
      com.aspose.slides.internal.k4y.h9p var3 = n5(var1);
      if (var0.getEmbeddedVideo() != null) {
         if (!var2.n3()) {
            var3.l6(var2.n5(var0.getEmbeddedVideo()));
            var3.l6(1);
         }
      } else {
         var3.l6(
            com.aspose.slides.ms.System.d1.n5(var0.getLinkPathLong())
               ? com.aspose.slides.ms.System.d1.n5
               : com.aspose.slides.internal.n8e.v4.n5(var0.getLinkPathLong())
         );
      }

      n5(var0.getPlayLoopMode(), var0.getVolume(), var3);
   }

   private static com.aspose.slides.internal.k4y.h9p n5(com.aspose.slides.internal.k4y.b4f var0) {
      com.aspose.slides.internal.k4y.h9p var1 = (com.aspose.slides.internal.k4y.h9p)var0.n5("plugin").l6();
      var1.n5("application/vnd.sun.star.media");
      var1.n5(1);
      var1.k5(1);
      var1.l6(com.aspose.slides.ms.System.d1.n5);
      return var1;
   }

   private static void n5(boolean var0, int var1, com.aspose.slides.internal.k4y.h9p var2) {
      com.aspose.slides.internal.k4y.t4i var3 = var2.n5();
      var3.n5("Loop");
      var3.l6(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.n3.l6(var0)));
      var3 = var2.n5();
      var3.n5("Mute");
      var3.l6(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.n3.l6(var1 == 0)));
      var3 = var2.n5();
      var3.n5("VolumeDB");
      var3.l6("0");
   }

   private static com.aspose.slides.internal.o9b.t4 n5() {
      com.aspose.slides.internal.o9b.l6 var0 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var1 = com.aspose.slides.internal.o9b.z1.n5(var0);

      try {
         var1.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }

      return var0;
   }
}

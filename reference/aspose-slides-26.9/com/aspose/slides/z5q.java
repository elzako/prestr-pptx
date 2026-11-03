package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ExternalException;
import com.aspose.slides.ms.System.IDisposable;

class z5q extends com.aspose.slides.internal.c8m.x8 {
   private i5s n5;
   private List<com.aspose.slides.internal.c8m.z5> l6;
   private List<Hyperlink> k5;
   private Dictionary<com.aspose.slides.internal.c8m.z5, IAudio> u3;
   private Dictionary<com.aspose.slides.internal.c8m.z5, IVideo> a6;
   private i5s u9;
   private final Presentation h0;
   private final Dictionary<com.aspose.slides.internal.c8m.z5, IPPImage> c8;
   private final InterruptionToken t2;

   public z5q(IPresentation var1, InterruptionToken var2) {
      this.h0 = (Presentation)var1;
      this.t2 = var2;
      this.c8 = new Dictionary<>();
      this.n5(new Dictionary<>());
      this.l6(new Dictionary<>());
      this.n5(new List<>());
      this.l6(new List<>());
   }

   final Presentation n5() {
      return this.h0;
   }

   public final i5s l6() {
      return this.u9;
   }

   public final void n5(i5s var1) {
      this.u9 = var1;
   }

   public final i5s k5() {
      return this.n5;
   }

   public final void l6(i5s var1) {
      this.n5 = var1;
   }

   public final InterruptionToken u3() {
      return this.t2;
   }

   final void n5(String var1, int var2) {
      if (this.n5().a6() != null && this.n5().a6().getWarningCallback() != null) {
         com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1, var2);
         var3.sendWarning(this.n5().a6().getWarningCallback());
      }
   }

   final IPPImage n5(com.aspose.slides.internal.c8m.z5 var1) {
      if (var1 == null) {
         String var2 = "Empty image part.";
         this.n5(var2, 1);
         return ((ImageCollection)this.h0.getImages()).n5();
      } else if (com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1.l6()), ".pdf")
         || com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1.l6()), ".pict")
         || com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1.l6()), ".svm")
         || com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1.l6()), ".webp")) {
         ((ImageCollection)this.n5().getImages()).k5(var1.l6());
         return null;
      } else {
         return !this.c8.containsKey(var1) ? this.l6(var1) : this.c8.get_Item(var1);
      }
   }

   private IPPImage l6(com.aspose.slides.internal.c8m.z5 var1) {
      try {
         IPPImage var3;
         try {
            if (com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1.l6()), ".svg")) {
               SvgImage var9 = new SvgImage(var1.a6());
               var3 = ((ImageCollection)this.n5().getImages()).n5((ISvgImage)var9);
            } else {
               var3 = var1.t2() == null ? this.n5().getImages().addImage(var1.a6()) : ((ImageCollection)this.n5().getImages()).n5(var1.t2());
            }
         } catch (ExternalException var4) {
            this.k5(var1.l6());
            return null;
         } catch (ArgumentException var5) {
            this.k5(var1.l6());
            return null;
         }

         this.c8.addItem(var1, var3);
         var1.n5(true);
         return var3;
      } catch (com.aspose.slides.internal.e5a.f2 var6) {
         var1.n5(true);
         String var8 = com.aspose.slides.ms.System.d1.n5("Embedded image is corrupted: {0}", new Object[]{var1.l6()});
         this.n5(var8, 1);
         return null;
      } catch (com.aspose.slides.internal.e5a.k5 var7) {
         String var2 = com.aspose.slides.ms.System.d1.n5("Error occured loading image: {0}", new Object[]{var7.getMessage()});
         this.n5(var2, 1);
         return null;
      }
   }

   final void n5(com.aspose.slides.internal.c8m.z5 var1, IVideo[] var2, IAudio[] var3) {
      if (this.t2().tryGetValue(var1, var2)) {
         var3[0] = null;
      } else if (!this.c8().tryGetValue(var1, var3)) {
         com.aspose.slides.internal.q7.c8 var5;
         if (var1.t2() != null) {
            boolean var4 = this.n5().a6().getBlobManagementOptions().getPresentationLockingBehavior() == 1;
            var5 = this.n5().w1().n5(var1.t2(), var4);
         } else {
            var5 = this.n5().w1().n5(var1.a6());
         }

         com.aspose.slides.internal.z0k.t4 var6 = var5.l6();

         String var11;
         try {
            byte[] var7 = new byte[(int)com.aspose.slides.internal.q7.n5.n5];
            var6.read(var7, 0, var7.length);
            var11 = e6f.n5(var7);
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }

         if (com.aspose.slides.ms.System.d1.l6(var11, "video")) {
            var2[0] = this.n5(var1, var5);
         } else {
            var3[0] = this.l6(var1, var5);
         }
      }
   }

   final IVideo n5(com.aspose.slides.internal.c8m.z5 var1, com.aspose.slides.internal.q7.c8 var2) {
      VideoCollection var3 = (VideoCollection)this.n5().getVideos();
      Video var4;
      if (var2 != null) {
         var4 = var3.n5(var2, null, null);
      } else {
         var4 = var1.t2() == null ? var3.n5(var1.a6(), null, null) : var3.n5(var1.t2(), null, null);
      }

      this.t2().addItem(var1, var4);
      var1.n5(true);
      return var4;
   }

   final IAudio l6(com.aspose.slides.internal.c8m.z5 var1, com.aspose.slides.internal.q7.c8 var2) {
      AudioCollection var3 = (AudioCollection)this.n5().getAudios();
      IAudio var4;
      if (var2 != null) {
         var4 = var3.n5(var2);
      } else {
         var4 = var1.t2() == null ? var3.addAudio(var1.a6()) : var3.n5(var1.t2());
      }

      Audio var5 = (Audio)var4;
      int var6 = com.aspose.slides.ms.System.d1.k5(var1.l6(), '.');
      var5.n5(var6 >= 0 ? com.aspose.slides.ms.System.d1.k5(var1.l6(), var6 + 1) : null);
      var5.n5().n5(com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var1.l6(), "/Media/", ""), ' ', '_'));
      this.c8().addItem(var1, var4);
      var1.n5(true);
      return var4;
   }

   private void k5(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5("GDI+ error occured loading image: {0}", new Object[]{var1});
      this.n5(var2, 1);
   }

   final Dictionary<com.aspose.slides.internal.c8m.z5, IPPImage> a6() {
      return this.c8;
   }

   public final IPPImage n5(String var1) {
      Dictionary$KeyCollection$Enumerator var2 = this.c8.getKeys().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.c8m.z5 var3 = (com.aspose.slides.internal.c8m.z5)var2.next();
            String var4 = var3.l6();
            if (com.aspose.slides.ms.System.d1.a6(var4, var1) || com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u3(var4,new char[]{ '/'}), var1)) {
               return this.c8.get_Item(var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public final com.aspose.slides.internal.c8m.z5 l6(String var1) {
      List$Enumerator var2 = this.u9().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.c8m.z5 var3 = (com.aspose.slides.internal.c8m.z5)var2.next();
            String var4 = var3.l6();
            if (com.aspose.slides.ms.System.d1.a6(var4, var1) || com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u3(var4,new char[]{ '/'}), var1)) {
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

   final List<com.aspose.slides.internal.c8m.z5> u9() {
      return this.l6;
   }

   private void n5(List<com.aspose.slides.internal.c8m.z5> var1) {
      this.l6 = var1;
   }

   final List<Hyperlink> h0() {
      return this.k5;
   }

   private void l6(List<Hyperlink> var1) {
      this.k5 = var1;
   }

   final Dictionary<com.aspose.slides.internal.c8m.z5, IAudio> c8() {
      return this.u3;
   }

   private void n5(Dictionary<com.aspose.slides.internal.c8m.z5, IAudio> var1) {
      this.u3 = var1;
   }

   final Dictionary<com.aspose.slides.internal.c8m.z5, IVideo> t2() {
      return this.a6;
   }

   private void l6(Dictionary<com.aspose.slides.internal.c8m.z5, IVideo> var1) {
      this.a6 = var1;
   }
}

package com.aspose.slides;

class r8u {
   private boolean n5;

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final h2d n5(byte var1, String var2) {
      return this.n5(var1, var2, false);
   }

   public final h2d n5(byte var1, String var2, boolean var3) {
      if (var1 == 8) {
         return this.n5(var2, d3t.t2, new r8u$1(this));
      } else {
         return var3 ? this.n5(var2, d3t.l6, new r8u$2(this)) : this.n5(var2, d3t.k5, new r8u$3(this));
      }
   }

   private h2d n5(String var1, com.aspose.slides.internal.r7c.c8 var2, r8u$n5 var3) {
      com.aspose.slides.internal.r7c.u3 var4 = var2.l6(var1);
      return !var4.u3() ? null : var3.n5(var4);
   }

   private h2d n5(com.aspose.slides.internal.r7c.u3 var1) {
      h2d var2 = new h2d();
      com.aspose.slides.internal.r7c.u3 var3 = var1;
      boolean var4 = false;

      while (var3.u3()) {
         String var5 = var3.a6().n5(1).k5();
         if (!"<p:sp>".equals(var5) && !"<a:p>".equals(var5)) {
            var4 = true;
            if ("<a:br>".equals(var5)) {
               var2.n5().n5(" ");
            } else {
               this.n5(var3.n5(), var3.a6().n5(4).k5(), var2);
            }

            var3 = var3.u9();
         } else {
            if (this.n5()) {
               boolean var6 = "<p:sp>".equals(var5);
               if (var3 != var1 && (!var6 || "<p:sp>".equals(var5)) && var4) {
                  var2.n5().n5(" ");
               }
            }

            var3 = var3.u9();
         }
      }

      return var2;
   }

   private h2d l6(com.aspose.slides.internal.r7c.u3 var1) {
      h2d var2 = new h2d();

      for (com.aspose.slides.internal.r7c.u3 var3 = var1; var3.u3(); var3 = var3.u9()) {
         var2.n5().l6(var3.a6().n5(1).k5());
      }

      return var2;
   }

   private h2d k5(com.aspose.slides.internal.r7c.u3 var1) {
      h2d var2 = new h2d();
      boolean var3 = false;
      String var4 = "";
      com.aspose.slides.internal.r7c.u3 var5 = var1;

      while (var5.u3()) {
         String var6 = var5.a6().n5(1).k5();
         if (!"<p:sp>".equals(var6) && !"<p:ph".equals(var6)) {
            if (!var3) {
               var4 = var5.a6().n5(5).k5();
               this.n5(var5.n5(), var4, var2);
            }

            var5 = var5.u9();
         } else {
            if (this.n5()) {
               var3 = "<p:ph".equals(var6);
               if ("<p:sp>".equals(var6) && !com.aspose.slides.ms.System.d1.n5(var4)) {
                  var2.n5().n5(" ");
               }

               var4 = "";
            }

            var5 = var5.u9();
         }
      }

      return var2;
   }

   private void n5(int var1, String var2, h2d var3) {
      var3.n5().n5(var2);
      var3.l6().addItem(new g4t(var1, var2.length()));
   }

   // $VF: synthetic method
   static h2d n5(r8u var0, com.aspose.slides.internal.r7c.u3 var1) {
      return var0.l6(var1);
   }

   // $VF: synthetic method
   static h2d l6(r8u var0, com.aspose.slides.internal.r7c.u3 var1) {
      return var0.k5(var1);
   }

   // $VF: synthetic method
   static h2d k5(r8u var0, com.aspose.slides.internal.r7c.u3 var1) {
      return var0.n5(var1);
   }
}

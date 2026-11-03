package com.aspose.slides.internal.z4;

public class d5 extends z1 {
   private int n5 = 1;
   private int k5 = 1;
   private int u3 = 1;
   private int a6 = 1;
   private int u9 = 0;
   private boolean h0 = false;
   private boolean c8 = false;
   private boolean t2 = false;
   private boolean s7 = false;
   private boolean x8 = false;
   private boolean n3 = false;
   private boolean y4 = false;

   public d5(c8 var1) {
      super(var1);
   }

   public final void n5(boolean var1) {
      this.c8 = var1;
   }

   public final void l6(boolean var1) {
      this.h0 = var1;
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      if (this.n5 != 1) {
         var1.k5("/PrintClip", com.aspose.slides.internal.z4.y4.n5(this.n5));
      }

      if (this.k5 != 1) {
         var1.k5("/PrintArea", com.aspose.slides.internal.z4.y4.n5(this.k5));
      }

      if (this.u3 != 1) {
         var1.k5("/ViewClip", com.aspose.slides.internal.z4.y4.n5(this.u3));
      }

      if (this.a6 != 1) {
         var1.k5("/ViewArea", com.aspose.slides.internal.z4.y4.n5(this.a6));
      }

      if (this.h0 && this.u9 != 0) {
         var1.k5("/NonFullScreenPageMode", com.aspose.slides.internal.z4.y4.l6(this.u9));
      }

      if (this.c8) {
         var1.n5("/DisplayDocTitle", this.c8);
      }

      if (this.t2) {
         var1.n5("/CenterWindow", this.t2);
      }

      if (this.s7) {
         var1.n5("/FitWindow", this.s7);
      }

      if (this.x8) {
         var1.n5("/HideWindowUI", this.x8);
      }

      if (this.n3) {
         var1.n5("/HideMenubar", this.n3);
      }

      if (this.y4) {
         var1.n5("/HideToolbar", this.y4);
      }

      var1.t2();
      var1.l6();
   }
}

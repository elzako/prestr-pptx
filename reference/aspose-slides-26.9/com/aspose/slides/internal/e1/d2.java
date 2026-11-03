package com.aspose.slides.internal.e1;

import com.aspose.slides.Collections.Generic.Dictionary;

public class d2 extends y4 {
   private Dictionary<com.aspose.slides.internal.p1s.l6, com.aspose.slides.internal.p1s.l6> n5 = new Dictionary<>();
   private float l6;
   private boolean k5;

   @Override
   public void n5(w1 var1) {
   }

   @Override
   public void n5(c4 var1) {
   }

   public final void n5(m3 var1, double var2) {
      this.n5((float)var2);
      this.l6(var1);
   }

   @Override
   public void n5(t2 var1) {
      if (var1.u3() != null) {
         this.n5(var1.u3());
      }

      if (var1.u9() != null) {
         var1.n5(this.n5(var1.u9()));
      }

      if (var1.a6() != null) {
         this.l6(var1.a6());
      }
   }

   public final com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.o9b.y1 var1) {
      return new com.aspose.slides.internal.o9b.y1(var1.x8() * this.n5(), var1.n3() * this.n5(), var1.s7() * this.n5(), var1.k5() * this.n5());
   }

   @Override
   public void n5(z1 var1) {
      if (var1.a6() != null) {
         this.l6(var1.a6());
      }

      if (var1.u3() != null) {
         this.n5(var1.u3());
      }

      if (var1.l6() != null) {
         this.n5(var1.l6());
      }

      var1.n5(this.n5(var1.s7().u3()).u3());
      var1.n5(this.n5(var1.y4().a6()).a6());
   }

   @Override
   public void l6(r4 var1) {
      if (var1.u3() != null) {
         this.n5(var1.u3());
      }

      if (var1.l6() != null) {
         this.n5(var1.l6());
      }

      if (var1.k5() != null) {
         this.n5(var1.k5());
      }

      if (var1.a6() != null) {
         this.l6((m3)var1.a6());
      }
   }

   @Override
   public void n5(y2 var1) {
      for (int var2 = 0; var2 < var1.n5().size(); var2++) {
         var1.n5().set_Item(var2, this.n5(var1.n5().get_Item(var2).u3()).u3());
      }
   }

   @Override
   public void n5(a6 var1) {
      u3 var2 = new u3();
      var2.l6(this.n5(var1.n5().l6().u3()).u3());
      var2.k5(this.n5(var1.n5().k5().u3()).u3());
      var2.u3(this.n5(var1.n5().u3().u3()).u3());
      var2.n5(this.n5(var1.n5().n5().u3()).u3());
      var1.n5(var2.u9());
   }

   @Override
   public void n5(k7 var1) {
      if (var1.c8() != null) {
         var1.n5(this.n5(var1.c8()));
      }

      var1.n5(this.n5(var1.n5().u3()).u3());
      var1.n5(this.n5(var1.l6().a6()).a6());
   }

   @Override
   public void n5(u9 var1) {
      var1.n5(this.n5(var1.n5().u3()).u3());
   }

   @Override
   public void n5(j5 var1) {
      var1.n5(this.n5(var1.n5().u3()).u3());
   }

   @Override
   public void n5(s3 var1) {
      var1.n5(this.n5(var1.u9().u3()).u3());
      var1.n5(this.n5(var1.x8().a6()).a6());
   }

   @Override
   public void n5(s7 var1) {
      var1.n5(this.n5(var1.u9().u3()).u3());
      var1.n5(var1.l6() * this.n5());
   }

   @Override
   public void n5(x8 var1) {
      var1.n5(this.n5(var1.u9().u3()).u3());
   }

   @Override
   public boolean n5(z3 var1) {
      return true;
   }

   private m1 n5(m1 var1) {
      return new m1(this.n5(var1.n5().y4()).y4(), var1.k5(), var1.h0());
   }

   private void n5(com.aspose.slides.internal.w0.c8 var1) {
      var1.n5(this.n5(), this.n5(), 1);
      var1.n5((float)(1.0 / this.n5()), (float)(1.0 / this.n5()), 0);
   }

   private void n5(com.aspose.slides.internal.p1s.l6 var1) {
      if (!this.n5.containsKey(var1)) {
         this.n5.addItem(var1, var1);
         if (this.k5) {
            var1.n5(var1.c8() * this.n5());
         }
      }
   }

   private void n5(com.aspose.slides.internal.w0.l6 var1) {
      com.aspose.slides.internal.w0.t9 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.w0.t9.class);
      if (var2 != null) {
         this.n5(var2.n3());
         switch (var1.n5()) {
            case 3:
               com.aspose.slides.internal.w0.h0 var3 = (com.aspose.slides.internal.w0.h0)var1;
               var3.n5(this.n5(var3.a6().y4()).y4());
               break;
            case 4:
               com.aspose.slides.internal.w0.t2 var4 = (com.aspose.slides.internal.w0.t2)var1;
               var4.n5(this.n5(var4.h0().u3()).u3());
               this.l6(var4.u9());
         }
      }
   }

   private void n5(com.aspose.slides.internal.w0.s7 var1) {
      var1.n5(var1.l6() * this.n5());
   }

   private com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1 var1) {
      return new com.aspose.slides.internal.o9b.w1(var1.l6() * this.n5(), var1.k5() * this.n5());
   }

   private com.aspose.slides.internal.o9b.f2 n5(com.aspose.slides.internal.o9b.f2 var1) {
      return new com.aspose.slides.internal.o9b.f2(var1.l6() * this.n5(), var1.k5() * this.n5());
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   private float n5() {
      return this.l6;
   }

   private void n5(float var1) {
      this.l6 = var1;
   }
}

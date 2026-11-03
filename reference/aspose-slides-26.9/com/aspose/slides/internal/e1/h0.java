package com.aspose.slides.internal.e1;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.ms.System.IDisposable;

public class h0 extends y4 {
   private k5 n5;
   private com.aspose.slides.internal.o9b.y1 l6 = new com.aspose.slides.internal.o9b.y1();
   private Stack<Float> k5 = new Stack<>();
   private boolean u3;
   private Stack<com.aspose.slides.internal.w0.c8> a6 = new Stack<>();

   @Override
   public void n5(w1 var1) {
   }

   @Override
   public void l6(w1 var1) {
   }

   @Override
   public void n5(t2 var1) {
      this.n5((p8)var1);
   }

   private void n5(p8 var1) {
      com.aspose.slides.internal.w0.c8 var2 = var1.u3();
      if (var2 == null) {
         var2 = new com.aspose.slides.internal.w0.c8();
      }

      if (this.a6.size() > 0) {
         com.aspose.slides.internal.w0.c8 var3 = this.a6.peek();
         com.aspose.slides.internal.w0.c8 var4 = var2.k5();
         var4.n5(var3, 1);
         this.a6.push(var4);
      } else {
         this.a6.push(var2);
      }
   }

   @Override
   public void l6(t2 var1) {
      this.n5();
   }

   private void n5() {
      this.a6.pop();
   }

   @Override
   public void n5(z1 var1) {
      this.n5((p8)var1);
      this.n5(var1.q0().y4());
      this.n5();
   }

   @Override
   public void l6(r4 var1) {
      this.n5((p8)var1);
      if (var1.l6() != null) {
         this.k5.push(var1.l6().l6() / 2.0F);
      } else {
         this.k5.push(0.0F);
      }
   }

   @Override
   public void n5(r4 var1) {
      this.k5.pop();
      this.n5();
   }

   @Override
   public void n5(c4 var1) {
   }

   @Override
   public void l6(c4 var1) {
   }

   @Override
   public void n5(y2 var1) {
      List$Enumerator var2 = var1.n5().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.o9b.w1 var3 = (com.aspose.slides.internal.o9b.w1)var2.next();
            this.n5(var3.u3());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public void n5(a6 var1) {
      com.aspose.slides.internal.o9b.y1 var2 = this.l6().n5(var1).y4();
      this.n5(var2.y4());
   }

   @Override
   public void n5(k7 var1) {
      this.n5(var1.k5().y4());
   }

   @Override
   public void n5(u9 var1) {
      this.n5(var1.n5().u3());
   }

   @Override
   public void n5(j5 var1) {
      this.n5(var1.n5().u3());
   }

   @Override
   public void n5(s3 var1) {
      this.n5(var1.u3().y4());
   }

   @Override
   public void n5(s7 var1) {
      this.n5(var1.u3().y4());
   }

   @Override
   public void n5(x8 var1) {
      this.n5(var1.u3().y4());
   }

   @Override
   public void n5(a0 var1) {
      this.n5(var1.u3().y4());
   }

   @Override
   public void n5(c8 var1) {
      this.n5(var1.u3().y4());
   }

   @Override
   public boolean n5(z3 var1) {
      return true;
   }

   public final com.aspose.slides.internal.o9b.y1 n5(m3 var1) {
      com.aspose.slides.internal.o9b.y1.n5.a6(this.l6);
      this.u3 = false;
      if (var1 == null) {
         return com.aspose.slides.internal.o9b.y1.n5;
      }

      this.l6(var1);
      return this.l6;
   }

   private void n5(com.aspose.slides.internal.o9b.y1 var1) {
      if (this.k5.size() > 0) {
         float var2 = this.k5.peek();
         com.aspose.slides.internal.o9b.y1.n5(var1.y4(), var2, var2).a6(var1);
      }

      if (this.a6.size() > 0) {
         com.aspose.slides.internal.w0.c8 var3 = this.a6.peek();
         var3.n5(var1.y4()).a6(var1);
      }

      if (this.u3) {
         com.aspose.slides.internal.o9b.y1.l6(this.l6.y4(), var1.y4()).a6(this.l6);
      } else {
         var1.a6(this.l6);
         this.u3 = true;
      }
   }

   private void n5(com.aspose.slides.internal.o9b.w1 var1) {
      this.n5(new com.aspose.slides.internal.o9b.y1(var1.u3(), com.aspose.slides.internal.o9b.f2.n5.a6()));
   }

   private k5 l6() {
      if (this.n5 == null) {
         this.n5 = new k5();
      }

      return this.n5;
   }
}

package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p3.o5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class a0 extends u9 {
   protected com.aspose.slides.internal.z6.x8 l6;
   protected List<o5> k5 = new List<>();
   private List<z3> u3 = new List<>();
   private List<z3> a6 = new List<>();

   public a0(com.aspose.slides.internal.y1.u3 var1, String var2, com.aspose.slides.internal.v0.h0 var3, com.aspose.slides.internal.z0k.t4 var4) {
      this.l6 = var1.q0().n5(var1, var2);

      try {
         this.l6.n5(var3);
         if (!var3.n5()) {
            throw new com.aspose.slides.internal.y1.l6("No default font defined by OutputConverter");
         }

         this.l6.n5(var4);
      } catch (IOException var6) {
         throw new com.aspose.slides.internal.y1.l6(var6.getMessage());
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.x7n.l6 var1) {
      this.l6.n5(var1);
   }

   @Override
   public void n5(c4 var1) {
      super.n5(var1);
      if (this.l6.s7()) {
         this.l6.n5(this.l6());
      }
   }

   @Override
   public void n5(o5 var1) {
      super.n5(var1);
      boolean var2 = this.l6.s7() && var1.k5();
      if (var2) {
         if (!this.l6.s7() && var1.n5().l6(var1)) {
            this.l6.n5(this.l6());
         }

         try {
            this.l6.l6(var1);
         } catch (IOException var5) {
            com.aspose.slides.internal.z6.y4 var7 = com.aspose.slides.internal.z6.m3.n5(this.l6.h0().m1());
            var7.n5(this, var5);
         } catch (com.aspose.slides.internal.y1.l6 var6) {
            String var4 = d1.n5(new String[]{"Error while rendering page ", var1.u9()});
            throw new InvalidOperationException(d1.n5(new String[]{"Fatal error occurred. Cannot continue. ", var6.getType().s7(), ": ", var4}));
         }

         var1.c8();
      } else {
         this.k5(var1);
      }

      boolean var3 = this.n5(var1, false);
      if (var3) {
         this.n5(this.u3);
         this.u3.clear();
      }
   }

   protected final boolean n5(o5 var1, boolean var2) {
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3<>(this.k5);

      while (var3.l6()) {
         o5 var4 = (o5)var3.k5();
         if (!var4.k5() && !var2) {
            if (!this.l6.s7()) {
               break;
            }
         } else {
            if (!this.l6.s7() && var4.n5().l6(var4)) {
               this.l6.n5(var4.n5());
            }

            this.l6(var4);
            var4.c8();
            var3.n5();
         }
      }

      return this.l6.s7() || this.k5.size() == 0;
   }

   protected final void l6(o5 var1) {
      this.l6.l6(var1);
      if (!var1.k5()) {
         String[] var2 = var1.u3();

         for (String var6 : var2) {
            t4 var7 = com.aspose.slides.internal.a0.k5.n5(this.l6.h0().m1());
            var7.l6(this, var1.u9(), var6);
         }
      }
   }

   protected final void k5(o5 var1) {
      if (this.l6.s7()) {
         this.l6.n5(var1);
      }

      this.k5.addItem(var1);
   }

   @Override
   public void n5(z3 var1) {
      switch (var1.n5()) {
         case 0:
            this.l6.n5(var1);
            break;
         case 1:
            this.u3.addItem(var1);
            break;
         case 2:
            this.a6.addItem(var1);
            break;
         default:
            throw new Exception();
      }
   }

   private void n5(List<z3> var1) {
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            z3 var3 = (z3)var2.next();
            this.l6.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public void n5() {
      this.n5(null, true);
      this.n5(this.u3);
      this.u3.clear();
      this.n5(this.a6);

      try {
         this.l6.t2();
      } catch (IOException var2) {
         throw new com.aspose.slides.internal.w2.c8(var2.getMessage());
      }
   }
}

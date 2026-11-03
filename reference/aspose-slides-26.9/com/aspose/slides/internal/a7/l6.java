package com.aspose.slides.internal.a7;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.f5.k5;
import com.aspose.slides.internal.j3.a6;
import com.aspose.slides.internal.j3.c4;
import com.aspose.slides.internal.j3.h0;
import com.aspose.slides.internal.j3.k7;
import com.aspose.slides.internal.j3.m1;
import com.aspose.slides.internal.j3.q0;
import com.aspose.slides.internal.j3.r4;
import com.aspose.slides.internal.j3.u3;
import com.aspose.slides.internal.j3.w1;
import com.aspose.slides.internal.j3.z3;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class l6 extends n5 {
   public l6(k5 var1) {
      super(var1);
   }

   @Override
   protected void n5(q0 var1) {
      this.n5().n5("<!DOCTYPE");
      this.n5().n5(' ');
      this.n5().n5("html");
      if (!d1.n5(var1.u3())) {
         this.n5().n5(' ');
         this.n5().n5("PUBLIC");
         this.n5().n5(' ');
         this.n5().n5(d1.n5(new String[]{"\"", var1.u3(), "\""}));
         if (!d1.n5(var1.a6())) {
            this.n5().n5(' ');
            this.n5().n5(d1.n5(new String[]{"\"", var1.a6(), "\""}));
         }
      } else if (!d1.n5(var1.a6())) {
         this.n5().n5(' ');
         this.n5().n5("SYSTEM");
         this.n5().n5(' ');
         this.n5().n5(d1.n5(new String[]{"\"", var1.a6(), "\""}));
      }

      this.n5().n5(">");
   }

   @Override
   protected void n5(c4 var1) {
      this.n5().n5(var1.n5());
   }

   @Override
   protected void n5(h0 var1) {
      this.n5().n5("<!--");
      this.n5().n5(var1.n5());
      this.n5().n5("-->");
   }

   @Override
   protected void n5(a6 var1) {
      this.n5().n5("<![CDATA[");
      this.n5().n5(var1.n5());
      this.n5().n5("]]>");
   }

   @Override
   protected void n5(m1 var1) {
   }

   @Override
   protected void n5(k7 var1) {
   }

   @Override
   protected void n5(w1 var1) {
   }

   @Override
   protected void n5(r4 var1) {
   }

   @Override
   protected void n5(z3 var1) {
      this.n5().n5('<');
      this.n5().n5(var1.t2());
      this.n5(var1.A_());
      this.n5().n5('>');
   }

   private void n5(u3 var1) {
      IEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.j3.k5 var3 = (com.aspose.slides.internal.j3.k5)var2.next();
            this.n5().n5(' ');
            this.n5().n5(var3.n5());
            if (!d1.n5(var3.k5())) {
               this.n5().n5('=');
               this.n5().n5(d1.n5(new String[]{"\"", var3.k5(), "\""}));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }
   }

   @Override
   protected void l6(z3 var1) {
      if (!((com.aspose.slides.internal.f5.z3)var1).u3().n5()) {
         this.n5().n5('<');
         this.n5().n5('/');
         this.n5().n5(var1.t2());
         this.n5().n5('>');
      }
   }
}

package com.aspose.slides.internal.k4o;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.c4i.a0;
import com.aspose.slides.internal.c4i.e5;
import com.aspose.slides.internal.c4i.m3;
import java.util.List;
import java.util.NoSuchElementException;

public class u3 implements u9 {
   private List<com.aspose.slides.internal.m5l.l6> n5;
   private List<e5> l6;
   private int k5 = 0;
   private int u3 = 0;

   public u3(k5 var1) {
      this.n5 = var1.n5;
   }

   @Override
   public boolean hasNext() {
      return this.l6();
   }

   private boolean l6() {
      return this.k5 < this.n5.size();
   }

   private boolean k5() {
      return this.u3 < this.l6.size();
   }

   @Override
   public void n5(Exception var1) throws com.aspose.slides.internal.p7x.l6 {
      this.h0();
   }

   public com.aspose.slides.internal.m5l.l6 n5() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         return this.l6 == null ? this.u3() : this.a6();
      }
   }

   private com.aspose.slides.internal.m5l.l6 u3() {
      com.aspose.slides.internal.m5l.l6 var1 = this.n5.get(this.k5);
      if (var1 instanceof com.aspose.slides.internal.x1f.n5) {
         com.aspose.slides.internal.x1f.n5 var2 = (com.aspose.slides.internal.x1f.n5)var1;
         if (var2.u3() != null) {
            this.n5(var2);
            return this.a6();
         }
      }

      this.k5++;
      return var1;
   }

   private com.aspose.slides.internal.m5l.l6 a6() {
      if (this.u3 > 0) {
         com.aspose.slides.internal.m5l.l6 var1 = this.l6.get(this.u3 - 1);
         if (var1 instanceof a0 && !this.k5()) {
            this.h0();
            return this.n5();
         }

         if (var1 instanceof m3) {
            this.t2();
            return this.n5();
         }

         if (!this.k5()) {
            this.c8();
            return this.u3();
         }
      }

      com.aspose.slides.internal.m5l.l6 var2 = this.l6.get(this.u3);
      this.u3++;
      return var2;
   }

   private void n5(com.aspose.slides.internal.x1f.n5 var1) {
      this.u3 = 0;
      this.l6 = var1.u3();
   }

   private void u9() {
      this.u3 = 0;
      this.l6 = null;
   }

   private void h0() {
      this.u9();
      this.k5++;
   }

   private com.aspose.slides.internal.x1f.n5 c8() {
      this.u9();
      this.k5++;

      for (; this.k5 < this.n5.size(); this.k5++) {
         com.aspose.slides.internal.m5l.l6 var1 = this.n5.get(this.k5);
         if (var1 instanceof com.aspose.slides.internal.x1f.n5) {
            com.aspose.slides.internal.x1f.n5 var2 = (com.aspose.slides.internal.x1f.n5)var1;
            if (var2.u3() != null) {
               return var2;
            }
         }
      }

      this.t2();
      return null;
   }

   private void t2() {
      this.u9();
      this.k5 = this.n5.size() - 1;
   }

   @Override
   public void remove() {
      throw new NotSupportedException("'remove' is not supported");
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.m5l.l6 next() {
      return this.n5();
   }

}

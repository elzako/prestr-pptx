package com.aspose.slides.internal.r6;

import com.aspose.slides.internal.b9.j5;
import com.aspose.slides.internal.k1.n3;
import com.aspose.slides.internal.k1.t2;
import com.aspose.slides.internal.t5.e2;
import com.aspose.slides.internal.t5.s7;
import com.aspose.slides.internal.t5.t4;
import com.aspose.slides.internal.t5.x8;
import com.aspose.slides.internal.t5.z1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.l4;

public class k5 {
   private final k5$n5[] n5;

   public k5(int var1) {
      this.n5 = new k5$n5[var1 + 1];
   }

   private k5(k5$n5[] var1) {
      this.n5 = var1;
   }

   public final void n5(long var1, com.aspose.slides.internal.y6.u3 var3) {
      if ((var1 & 4294967295L) < this.n5.length) {
         this.n5[(int)var1] = new k5$n5(var3);
      } else {
         com.aspose.slides.internal.f8y.n5.k5(d1.n5(new String[]{"Invalid object index >= object table size. Index=", l4.l6(var1)}));
      }
   }

   private void l6(long var1) {
      if ((var1 & 4294967295L) != 0L && (var1 & 4294967295L) < this.n5.length && this.n5[(int)var1] != null) {
         this.n5[(int)var1].n5(false);
      }
   }

   public final void n5(long var1, u9 var3) {
      if ((var1 & 4294967295L) < this.n5.length && (var1 & 4294967295L) > 0L && this.n5[(int)var1] != null) {
         this.n5[(int)var1].n5(true);
         com.aspose.slides.internal.y6.u3 var4 = this.n5[(int)var1].k5();
         if (com.aspose.slides.internal.v6g.k5.l6(var4, s7.class) || com.aspose.slides.internal.v6g.k5.l6(var4, t2.class)) {
            this.l6(var3.a6());
            var3.k5(var1);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var4, n3.class) || com.aspose.slides.internal.v6g.k5.l6(var4, j5.class)) {
            this.l6(var3.u3());
            var3.l6(var1);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var4, e2.class)) {
            this.l6(var3.k5());
            var3.n5(var1);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var4, z1.class) || com.aspose.slides.internal.v6g.k5.l6(var4, t4.class)) {
            this.l6(var3.u9());
            var3.u3(var1);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var4, x8.class)) {
            this.l6(var3.h0());
            var3.a6(var1);
         }
      } else {
         com.aspose.slides.internal.f8y.n5.k5(d1.n5(new String[]{"Invalid object index >= object table size. Index=", l4.l6(var1)}));
      }
   }

   public final void l6(long var1, u9 var3) {
      switch ((int)var1) {
         case Integer.MIN_VALUE:
         case -2147483647:
         case -2147483646:
         case -2147483645:
         case -2147483644:
         case -2147483643:
            this.l6(var3.a6());
            var3.k5(var1 & 4294967295L);
            break;
         case -2147483642:
         case -2147483641:
         case -2147483640:
            this.l6(var3.u9());
            var3.u3(var1 & 4294967295L);
         case -2147483639:
         case -2147483630:
         case -2147483629:
         default:
            break;
         case -2147483638:
         case -2147483637:
         case -2147483636:
         case -2147483635:
         case -2147483634:
         case -2147483632:
         case -2147483631:
            this.l6(var3.h0());
            var3.a6(var1 & 4294967295L);
            break;
         case -2147483633:
            this.l6(var3.k5());
            var3.n5(var1 & 4294967295L);
      }
   }

   public final void k5(long var1, u9 var3) {
      if ((var1 & 4294967295L) < this.n5.length && (var1 & 4294967295L) > 0L) {
         if (this.n5[(int)var1] != null && this.n5[(int)var1].l6()) {
            if (var1 == var3.u9()) {
               var3.u3(0L);
            } else if (var1 == var3.a6()) {
               var3.k5(0L);
            } else if (var1 == var3.h0()) {
               var3.a6(0L);
            } else if (var1 == var3.k5()) {
               var3.n5(0L);
            } else if (var1 == var3.u3()) {
               var3.l6(0L);
            }
         }

         this.n5[(int)var1] = null;
      } else {
         com.aspose.slides.internal.f8y.n5.k5(d1.n5(new String[]{"Invalid object index >= object table size. Index=", l4.l6(var1)}));
      }
   }

   public final com.aspose.slides.internal.y6.u3 n5(long var1) {
      return (var1 & 4294967295L) < this.n5.length && this.n5[(int)var1] != null ? this.n5[(int)var1].k5() : null;
   }

   public final k5 n5() {
      k5$n5[] var1 = new k5$n5[this.n5.length];

      for (int var2 = 0; var2 < this.n5.length; var2++) {
         k5$n5 var3 = this.n5[var2];
         if (var3 != null) {
            var1[var2] = var3.n5();
         }
      }

      return new k5(var1);
   }
}

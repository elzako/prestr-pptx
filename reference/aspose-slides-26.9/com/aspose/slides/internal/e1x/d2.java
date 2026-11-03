package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.q1;

public class d2 {
   private com.aspose.slides.internal.n2d.k5 n5;
   private long l6;
   private long k5;
   private List<Long> u3;
   private d5 a6 = new d5();

   public final d5 n5() {
      return this.a6;
   }

   public d2(com.aspose.slides.internal.n2d.k5 var1, long var2, long var4) {
      this.n5 = var1;
      this.k5 = this.n5.n5().getPosition();
      this.l6 = var2;
      List var6 = new List();
      var6.addItem(var4);
      this.u3 = var6;
   }

   public final void l6() {
      this.n5.n5().setPosition(this.l6 + this.u3.get_Item(0));
      short var1 = this.n5.u3();
      long var2 = this.n5.a6() & 65535;
      byte var4 = (byte)this.n5.u3();
      byte var5 = (byte)this.n5.u3();
      t2 var6 = new t2(this.n5, this.l6 + this.u3.get_Item(0) + var2);
      var6.l6();
      if (var1 == 1) {
         short var7 = this.n5.u3();

         for (long var8 = 0L; (var8 & 4294967295L) < var7; var8++) {
            long var10 = this.n5.a6() & 65535;
            List var12 = new List();
            long var13 = this.n5.n5().getPosition();
            this.n5.n5().setPosition(this.l6 + this.u3.get_Item(0) + var10);
            long var15 = this.n5.a6() & 65535;

            for (long var17 = 0L; (var17 & 4294967295L) < (var15 & 4294967295L); var17++) {
               long var19 = this.n5.a6() & 65535;
               p3 var21 = this.n5(var4);
               p3 var22 = this.n5(var5);
               s3 var23 = new s3(var19, var21, var22);
               var12.addItem(var23);
               this.a6.n5(var6.n5().get_Item(var8), var23);
            }

            this.n5.n5().setPosition(var13);
         }
      } else {
         long var24 = this.n5.a6() & 65535;
         c8 var26 = new c8(this.n5, this.l6 + this.u3.get_Item(0) + var24);
         var26.l6();
         long var34 = this.n5.a6() & 65535;
         c8 var35 = new c8(this.n5, this.l6 + this.u3.get_Item(0) + var34);
         var35.l6();
         long var36 = this.n5.a6() & 65535;
         long var37 = this.n5.a6() & 65535;

         for (long var38 = 0L; (var38 & 4294967295L) < (var36 & 4294967295L); var38++) {
            List var27 = new List();

            for (long var28 = 0L; (var28 & 4294967295L) < (var37 & 4294967295L); var28++) {
               p3 var39 = this.n5(var4);
               p3 var40 = this.n5(var5);
               if (!var39.t2() || !var40.t2()) {
                  s3 var30 = new s3(var28, var39, var40);

                  for (int var31 = 0; var31 < var26.n5().get_Item(var38).size(); var31++) {
                     for (int var32 = 0; var32 < var35.n5().get_Item(var28).size(); var32++) {
                        s3 var33 = new s3(var35.n5().get_Item(var28).get_Item(var32), var39, var40);
                        this.a6.n5(var26.n5().get_Item(var38).get_Item(var31), var33);
                     }
                  }

                  var27.addItem(var30);
               }
            }
         }
      }

      this.n5.n5().setPosition(this.k5);
   }

   private p3 n5(byte var1) {
      p3 var2 = new p3();
      if ((var1 & 1) != 0) {
         var2.n5(this.n5.u3());
      }

      if ((var1 & 2) != 0) {
         var2.l6(this.n5.u3());
      }

      if ((var1 & 4) != 0) {
         var2.k5(this.n5.u3());
      }

      if ((var1 & 8) != 0) {
         var2.u3(this.n5.u3());
      }

      if ((var1 & 16) != 0) {
         var2.n5(this.k5());
      }

      if ((var1 & 32) != 0) {
         var2.l6(this.k5());
      }

      if ((var1 & 64) != 0) {
         var2.k5(this.k5());
      }

      if ((var1 & -128) != 0) {
         var2.u3(this.k5());
      }

      return var2;
   }

   private Dictionary<Long, Integer> k5() {
      Dictionary var1 = null;
      long var2 = this.n5.a6() & 65535;
      long var4 = this.n5.n5().getPosition();
      this.n5.n5().setPosition(this.l6 + this.u3.get_Item(0) + var2);
      long var6 = this.n5.a6() & 65535;
      long var8 = this.n5.a6() & 65535;
      int var10 = this.n5.a6() & 65535;
      if (var10 == 1 || var10 == 2 || var10 == 3) {
         var1 = new Dictionary();
         int var11 = com.aspose.slides.internal.v6g.k5.u3(q1.a6(2.0, var10), 14);
         int var12 = 16 / var11;
         int var13 = com.aspose.slides.internal.v6g.k5.u3(q1.a6(2.0, var11) - 1.0, 14);
         long var14 = var6;

         do {
            long var16 = this.n5.a6() & 65535;

            for (int var18 = 0; var18 < var12 && var1.size() <= ((var8 & 4294967295L) - (var6 & 4294967295L) & 4294967295L); var18++) {
               int var19 = (int)((var16 & 4294967295L) >> var18 * var11 & 4294967295L & var13 & 4294967295L);
               var1.addItem(var14++, var19);
            }
         } while ((var14 & 4294967295L) <= (var8 & 4294967295L));
      }

      this.n5.n5().setPosition(var4);
      return var1;
   }
}

package com.aspose.slides.internal.y9w;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.q1;

public class a6 {
   private t4 n5;
   private u9 l6;
   private u3 k5;
   private t2 u3;
   private k5 a6;
   private e2 u9;
   private h0 h0;

   public a6() {
   }

   public a6(h0 var1) {
      this.h0 = var1;
   }

   public a6(t4 var1) {
      this.l6(var1);
   }

   private void l6(t4 var1) {
      this.n5 = var1;
      this.n5.setPosition(0L);
      this.l6 = new u9(new com.aspose.slides.internal.z0k.n5(this.n5, j5.z1()));
      this.k5 = new u3(this.n5, this.l6);
      this.k5.n5();
      this.l6();
      this.u3 = new t2(this.n5(this.l6.t2, this.l6.n5(), this.l6.n5(), true));
      this.k5();
   }

   private void l6() {
      byte var1 = 10;
      int var2 = q1.l6(10, this.k5.u3());

      for (long var3 = 0L; (var3 & 4294967295L) < var2; var3++) {
         if ((this.k5.l6(var3) & 4294967295L) != 0L) {
            return;
         }
      }

      throw new InvalidOperationException("The FAT in the structured storage document seems to be corrupted.");
   }

   public final void n5(t4 var1) {
      this.n5 = var1;
      this.n5.setPosition(512L);
      this.l6 = new u9();
      this.k5 = new u3(this.n5, this.l6);
      this.u3 = new t2();
      this.u9 = new e2();
      this.a6 = new k5();
      this.n5(this.h0, null);
      if (this.u9.getLength() > 0L) {
         this.a6.n5(0L).x8 = this.n5(this.u9, true);
         this.a6.n5(0L).n3 = this.u9.getLength();
         int var2 = 0;
         int[] var3 = new int[]{0};
         this.l6.t2 = this.n5(this.u3.k5(), true, var3);
         var2 = var3[0];
         this.l6.s7 = var2;
      } else {
         this.l6.t2 = 4294967294L;
      }

      this.l6.h0 = this.n5(this.a6.l6(), true);
      this.k5.l6();
      this.n5.setPosition(0L);
      this.l6.n5(new com.aspose.slides.internal.z0k.l6(this.n5, j5.z1()));
      this.n5.setPosition(this.n5.getLength());
   }

   private void n5(h0 var1, l6 var2) {
      if (var2 == null) {
         var2 = new l6("Root Entry", true, var1.n5().k5());
         this.a6.n5(var2);
      }

      if (var1.size() > 0) {
         var2.u9 = this.a6.n5() & 4294967295L;
      }

      for (int var3 = 0; var3 < var1.size(); var3++) {
         String var4 = var1.getKeys().get_Item(var3);
         Object var5 = var1.getValues().get_Item(var3);
         h0 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, h0.class);
         l6 var7;
         if (var6 != null) {
            var7 = new l6(var4, false, var6.n5().k5());
            this.a6.n5(var7);
            this.n5(var6, var7);
         } else {
            t4 var8 = com.aspose.slides.internal.v6g.k5.n5(var5, t4.class);
            if (var8 == null) {
               throw new InvalidOperationException("Unknown object in memory storage.");
            }

            var7 = new l6(var4, 2, var8.getLength());
            this.a6.n5(var7);
            var7.x8 = this.n5(var8, false);
         }

         if (var3 < var1.size() - 1) {
            var7.a6 = this.a6.n5() & 4294967295L;
         }
      }
   }

   private long n5(t4 var1, boolean var2, int[] var3) {
      var3[0] = 0;
      if (var1.getLength() == 0L) {
         return 4294967294L;
      }

      boolean var4 = this.l6.n5(var1.getLength()) || var2;
      t2 var5 = var4 ? this.k5 : this.u3;
      t4 var6 = var4 ? this.n5 : this.u9;
      int var7 = var4 ? 512 : 64;
      long var8 = s7.l6(var6.getPosition(), var4);
      var1.setPosition(0L);
      com.aspose.slides.internal.n2d.t4.n5(var1, var6);
      com.aspose.slides.internal.n2d.t4.n5(var6, var7);
      var3[0] = com.aspose.slides.internal.n2d.t4.n5(var1.getLength(), var7);

      for (long var10 = 1L; (var10 & 4294967295L) < var3[0]; var10++) {
         var5.n5((var8 & 4294967295L) + (var10 & 4294967295L) & 4294967295L);
      }

      var5.n5(4294967294L);
      return var8;
   }

   private long n5(t4 var1, boolean var2) {
      int var3 = 0;
      int[] var4 = new int[]{0};
      long var5 = this.n5(var1, var2, var4);
      var3 = var4[0];
      return var5;
   }

   private void k5() {
      this.a6 = new k5();
      com.aspose.slides.internal.z0k.n5 var1 = new com.aspose.slides.internal.z0k.n5(this.n5, j5.z1());
      byte var2 = 4;

      for (long var3 = this.l6.h0; (var3 & 4294967295L) != 4294967294L; var3 = this.k5.l6(var3)) {
         this.n5.setPosition(s7.n5(var3, true));

         for (int var5 = 0; var5 < 4; var5++) {
            this.a6.n5(new l6(var1));
         }
      }
   }

   private e2 n5(long var1, int var3, int var4, boolean var5) {
      var4 = q1.l6(var3, var4);
      e2 var6 = new e2(var4);
      var6.setLength(var4);
      boolean var7 = var5 || this.l6.n5(var3);
      if (!var7) {
         l6 var8 = this.a6.n5(0L);
         if ((var8.x8 & 4294967295L) != 4294967295L && this.u9 == null) {
            this.u9 = this.n5(var8.x8, (int)var8.n3, (int)var8.n3, true);
         }

         if (this.l6.n5() == 0 || this.u9 == null) {
            var6.setLength(0L);
            return var6;
         }
      }

      t2 var22 = var7 ? this.k5 : this.u3;
      t4 var9 = var7 ? this.n5 : this.u9;
      int var10 = var7 ? 512 : 64;
      int var11 = 0;
      long var12 = var9.getPosition();

      for (long var14 = var1; (var14 & 4294967295L) != 4294967294L && (var14 & 4294967295L) != 4294967295L; var14 = var22.l6(var14)) {
         long var16 = s7.n5(var14, var7);
         if (var12 != var16) {
            var12 = var16;
            var9.setPosition(var16);
         }

         int var18 = var4 - var11;
         if (var18 == 0) {
            break;
         }

         int var19 = q1.l6(var10, var18);
         int var20 = var9.read(var6.getBuffer(), var11, var19);
         if (var20 != var19) {
            com.aspose.slides.internal.f8y.n5.u3("The structured file is probably corrupt. Cannot read all data that was expected, but okay to continue.");
         }

         var11 += var19;
         var12 += var19;
      }

      return var6;
   }

   private void u3() {
      this.n5(this.a6.n5(0L), null);
   }

   private void n5(l6 var1, h0 var2) {
      if (var1.y4) {
         com.aspose.slides.internal.f8y.n5.u3("The structured storage file seems to be corrupt. This directory entry was already read, ignoring.");
      } else {
         var1.y4 = true;
         switch (var1.l6) {
            case 0:
               return;
            case 1:
            case 5:
               h0 var3 = new h0(var1.h0.k5());
               if (var1.l6 == 5 && this.h0 == null) {
                  this.h0 = var3;
               } else {
                  var2.n5(var1.n5, var3);
               }

               l6 var4 = this.a6.n5(var1, var1.u9);
               if (var4 != null) {
                  this.n5(var4, var3);
               }
               break;
            case 2:
               var2.n5(var1.n5, this.n5(var1.x8, (int)var1.n3, (int)var1.n3, false));
               break;
            case 3:
            case 4:
            default:
               throw new InvalidOperationException("Unknown type of directory entry in the structured storage.");
         }

         l6 var5 = this.a6.n5(var1, var1.u3);
         if (var5 != null) {
            this.n5(var5, var2);
         }

         l6 var6 = this.a6.n5(var1, var1.a6);
         if (var6 != null) {
            this.n5(var6, var2);
         }
      }
   }

   public final h0 n5() {
      if (this.h0 == null) {
         this.u3();
      }

      return this.h0;
   }
}

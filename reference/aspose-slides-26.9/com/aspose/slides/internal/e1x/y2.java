package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class y2 {
   private com.aspose.slides.internal.n2d.k5 n5;
   private long l6;
   private long k5;
   private List<Long> u3;
   private Dictionary<Long, Dictionary<Integer, com.aspose.slides.internal.o9b.j5>> a6 = new Dictionary<>();
   private Dictionary<Long, Dictionary<Integer, com.aspose.slides.internal.o9b.j5>> u9 = new Dictionary<>();
   private c4 h0;

   public final c4 n5() {
      return this.h0;
   }

   public final void n5(c4 var1) {
      this.h0 = var1;
   }

   public y2(com.aspose.slides.internal.n2d.k5 var1, long var2, long var4) {
      this.n5 = var1;
      this.k5 = this.n5.n5().getPosition();
      this.l6 = var2;
      List var6 = new List();
      var6.addItem(var4);
      this.u3 = var6;
      this.n5(new c4());
   }

   public final void l6() {
      this.n5.n5().setPosition(this.l6 + this.u3.get_Item(0));
      short var1 = this.n5.u3();
      long var2 = this.n5.a6() & 65535;
      long var4 = this.n5.a6() & 65535;
      int var6 = this.n5.a6() & 65535;
      long var7 = this.n5.a6() & 65535;
      long var9 = this.n5.a6() & 65535;
      t2 var11 = new t2(this.n5, this.l6 + this.u3.get_Item(0) + var2);
      var11.l6();
      t2 var12 = new t2(this.n5, this.l6 + this.u3.get_Item(0) + var4);
      var12.l6();
      this.n5(var7, var11);
      this.n5(var9, var12, var6);
      this.n5().n5(this.a6);
      this.n5().l6(this.u9);
   }

   private void n5(long var1, t2 var3) {
      long var4 = this.n5.n5().getPosition();
      this.n5.n5().setPosition(this.l6 + this.u3.get_Item(0) + var1);
      int var6 = this.n5.a6() & 65535;

      for (int var7 = 0; var7 < var6; var7++) {
         int var8 = this.n5.a6() & 65535;
         long var9 = this.n5.a6() & 65535;
         Dictionary var11 = new Dictionary();
         com.aspose.slides.internal.o9b.j5 var12 = this.n5(var1 + var9).k5();
         if (var12.n5() != Integer.MIN_VALUE) {
            var11.addItem(var8, var12.k5());
            this.a6.addItem(var3.n5().get_Item(var7 & 4294967295L), var11);
         }
      }

      this.n5.n5().setPosition(var4);
   }

   private void n5(long var1, t2 var3, int var4) {
      long var5 = this.n5.n5().getPosition();
      this.n5.n5().setPosition(this.l6 + this.u3.get_Item(0) + var1);
      int var7 = this.n5.a6() & 65535;

      for (int var8 = 0; var8 < var7; var8++) {
         Dictionary var9 = new Dictionary();

         for (int var10 = 0; var10 < var4; var10++) {
            long var11 = this.n5.a6() & 65535;
            com.aspose.slides.internal.o9b.j5 var13 = this.n5(var1 + var11).k5();
            if (var13.n5() != Integer.MIN_VALUE) {
               var9.addItem(var10, var13.k5());
            }
         }

         this.u9.addItem(var3.n5().get_Item(var8 & 4294967295L), var9);
      }

      this.n5.n5().setPosition(var5);
   }

   private com.aspose.slides.internal.o9b.j5 n5(long var1) {
      long var3 = this.n5.n5().getPosition();
      this.n5.n5().setPosition(this.l6 + this.u3.get_Item(0) + var1);
      int var5 = this.n5.a6() & 65535;
      short var6;
      short var7;
      if (var5 == 1) {
         var6 = this.n5.u3();
         var7 = this.n5.u3();
      } else if (var5 == 2) {
         var6 = this.n5.u3();
         var7 = this.n5.u3();
         short var8 = this.n5.u3();
      } else {
         if (var5 != 3) {
            com.aspose.slides.internal.f8y.n5.u3("Ancor table in Mark-To-Base lookup has wrobg format!!!");
            return new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, Integer.MIN_VALUE);
         }

         var6 = this.n5.u3();
         var7 = this.n5.u3();
         long var9 = this.n5.a6() & 65535;
         if (var9 != 0L) {
         }

         long var11 = this.n5.a6() & 65535;
         if (var11 != 0L) {
         }
      }

      com.aspose.slides.internal.o9b.j5 var13 = new com.aspose.slides.internal.o9b.j5(var6, var7);
      this.n5.n5().setPosition(var3);
      return var13;
   }
}

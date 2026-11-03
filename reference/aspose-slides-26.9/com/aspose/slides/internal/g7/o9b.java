package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public class o9b extends n3c {
   private int n5;
   private int[] l6;
   private int[] k5;
   private short[] u3;
   private int[] a6;
   private int[] u9;
   private SortedList<Integer, Integer> h0 = new SortedList<>();

   public o9b(int var1, int var2, v7u var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(f3c var1) {
      int var2 = var1.n3();
      var1.n3();
      this.n5 = (var1.n3() & 65535) / 2 & 65535;
      var1.n3();
      var1.n3();
      var1.n3();
      this.l6 = new int[this.n5 & 65535];

      for (int var3 = 0; var3 < this.l6.length; var3++) {
         this.l6[var3] = var1.n3();
      }

      var1.n3();
      this.k5 = new int[this.n5 & 65535];
      this.u3 = new short[this.n5 & 65535];
      this.u9 = new int[this.n5 & 65535];

      for (int var6 = 0; var6 < this.k5.length; var6++) {
         this.k5[var6] = var1.n3();
      }

      for (int var7 = 0; var7 < this.u3.length; var7++) {
         this.u3[var7] = var1.t2();
      }

      for (int var8 = 0; var8 < this.u9.length; var8++) {
         this.u9[var8] = var1.n3();
      }

      int var9 = ((var2 & 65535) - (8 * (this.n5 & 65535) + 16)) / 2;
      if (var9 < 0) {
         var9 = this.n5 & 65535;
      }

      this.a6 = new int[var9];

      for (int var4 = 0; var4 < var9; var4++) {
         this.a6[var4] = var1.n3();
      }

      for (int var10 = 0; var10 < this.k5.length; var10++) {
         for (int var5 = 0; var5 <= (this.l6[var10] & 65535) - (this.k5[var10] & 65535); var5++) {
            this.h0.addItem((this.k5[var10] & 65535) + var5 & 65535, this.n5((this.k5[var10] & 65535) + var5) & 65535);
         }
      }

      super.n5(var1);
   }

   @Override
   public int[] n5() {
      return this.a6;
   }

   @Override
   public void n5(int var1, int var2) {
      if (var1 <= 65535) {
         if (!this.h0.containsKey(var1 & 65535)) {
            this.h0.addItem(var1 & 65535, var2 & 65535);
         }
      }
   }

   private void l6() {
      com.aspose.slides.ms.System.o5 var1 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5 var2 = new com.aspose.slides.ms.System.o5();
      List var3 = new List();
      List var4 = new List();
      IGenericEnumerator var5 = this.h0.getKeys().iterator();

      try {
         while (var5.hasNext()) {
            int var6 = com.aspose.slides.internal.v6g.k5.u3(var5.next(), int.class);
            if (com.aspose.slides.ms.System.o5.n5(var1, null)) {
               var1 = new com.aspose.slides.ms.System.o5<>(var6);
               var2 = new com.aspose.slides.ms.System.o5<>(var6);
            } else {
               com.aspose.slides.ms.System.o5 var7 = (var2.l6()
                     ? new com.aspose.slides.ms.System.o5<>(((Integer)var2.n5(int.class) & 65535) + 1)
                     : new com.aspose.slides.ms.System.o5<>())
                  .k5();
               if (com.aspose.slides.ms.System.o5.n5(new com.aspose.slides.ms.System.o5<>(var6), var7)) {
                  var2 = new com.aspose.slides.ms.System.o5<>(var6);
               } else {
                  var3.addItem(new o9b$n5((Integer)var1.n5() & 65535, (Integer)var2.n5() & 65535));
                  var1 = new com.aspose.slides.ms.System.o5<>(var6);
                  var2 = new com.aspose.slides.ms.System.o5<>(var6);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (com.aspose.slides.ms.System.o5.l6(var1, null)) {
         var3.addItem(new o9b$n5((Integer)var1.n5() & 65535, (Integer)var2.n5() & 65535));
      }

      this.n5 = var3.size() & 65535;
      this.k5 = new int[var3.size()];
      this.l6 = new int[var3.size()];
      this.u3 = new short[var3.size()];
      this.u9 = new int[var3.size()];
      Dictionary var20 = new Dictionary();

      for (int var21 = 0; var21 < var3.size(); var21++) {
         o9b$n5 var8 = (o9b$n5)var3.get_Item(var21);
         int var9 = this.h0.get_Item(var8.n5);
         boolean var10 = true;

         for (int var11 = var8.n5; (var11 & 65535) <= (var8.l6 & 65535) && (var11 & 65535) != 0; var11++) {
            int var12 = this.h0.get_Item(var11);
            if ((var11 & 65535) - (var8.n5 & 65535) + (var9 & 65535) != (var12 & 65535)) {
               var10 = false;
               break;
            }
         }

         this.k5[var21] = var8.n5;
         this.l6[var21] = var8.l6;
         if (var10) {
            this.u3[var21] = (short)((var9 & 65535) - (var8.n5 & 65535));
            this.u9[var21] = 0;
         } else {
            this.u3[var21] = 0;
            var20.set_Item(var21, var4.size() & 65535);

            for (int var25 = var8.n5 & 65535; var25 <= (var8.l6 & 65535); var25++) {
               int var26 = this.h0.get_Item(var25 & 65535);
               var4.addItem(var26);
            }
         }
      }

      Dictionary$Enumerator var22 = var20.iterator();

      try {
         while (var22.hasNext()) {
            KeyValuePair var23 = (KeyValuePair)var22.next();
            this.u9[(Integer)var23.getKey()] = (((Integer)var23.getValue() & 65535) + ((this.n5 & 65535) - (Integer)var23.getKey())) * 2 & 65535;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      this.a6 = new int[var4.size()];

      for (int var24 = 0; var24 < this.a6.length; var24++) {
         this.a6[var24] = (Integer)var4.get(var24);
      }
   }

   @Override
   public void n5(byte[][] var1, long[] var2) {
      this.n5(65535, 0);
      this.l6();
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

      try {
         j2p var4 = new j2p(var3, true);

         try {
            var4.n5(4);
            var4.n5(0);
            var4.n5(0);
            var4.n5((this.n5 & 65535) * 2 & 65535);
            int var5 = com.aspose.slides.internal.v6g.k5.k5(
               2.0 * com.aspose.slides.ms.System.q1.a6(2.0, com.aspose.slides.ms.System.q1.k5(com.aspose.slides.ms.System.q1.n5((double)(this.n5 & 65535), (double)(2.0)))), 14
            );
            var4.n5(var5);
            var4.n5(com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.q1.n5((double)((var5 & 65535) / 2.0F), (double)(2.0)), 14));
            var4.n5(2 * (this.n5 & 65535) - (var5 & 65535) & 65535);
            var4.n5(this.l6);
            var4.n5(0);
            var4.n5(this.k5);
            var4.n5(this.u3);
            var4.n5(this.u9);
            var4.n5(this.a6);
            var2[0] = (int)var3.getPosition() & 65535;
            var4.n5(2L);
            var4.n5((int)(var2[0] & 65535L));
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }

         var3.close();
         var1[0] = var3.toArray();
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   public int n5(int var1) {
      if (this.k5().a0()) {
         if (this.h0.containsKey(Integer.valueOf((char)(var1 & 65535)))) {
            return this.h0.get_Item(var1 & 65535) & 65535;
         }
      } else {
         for (int var2 = 0; var2 < (this.n5 & 65535); var2++) {
            if (var1 <= (this.l6[var2] & 65535) && (this.k5[var2] & 65535) <= var1) {
               if ((this.u9[var2] & 65535) <= 0) {
                  return (this.u3[var2] + var1) % 65536;
               }

               int var3 = (this.u9[var2] & 65535) / 2 + (var1 - (this.k5[var2] & 65535)) - ((this.n5 & 65535) - var2);
               if (var3 < this.a6.length) {
                  return this.a6[var3] & 65535;
               }
            } else if (var1 <= (this.l6[var2] & 65535)) {
               break;
            }
         }
      }

      return 0;
   }
}

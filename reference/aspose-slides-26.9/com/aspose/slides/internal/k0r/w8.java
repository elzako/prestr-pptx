package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public class w8 implements IGenericEnumerable<q1> {
   private final SortedList<Integer, q1> n5 = new SortedList<>();

   public final q1 n5(int var1) {
      q1 var2 = null;
      q1[] var3 = new q1[]{var2};
      boolean var4 = !this.n5.tryGetValue(var1, var3);
      var2 = var3[0];
      return var4 ? null : var2;
   }

   public final void n5(int var1, q1 var2) {
      this.n5.set_Item(var1, var2);
   }

   public final int n5() {
      return this.n5.size();
   }

   public final void n5(q1 var1) {
      this.n5.addItem(var1.y4(), var1);
   }

   public final void l6(q1 var1) {
      if (!this.n5.containsKey(var1.y4())) {
         this.n5(var1);
      } else {
         this.n5.set_Item(var1.y4(), var1);
      }
   }

   public final void l6() {
      this.n5.clear();
   }

   public final boolean l6(int var1) {
      return this.n5.containsKey(var1);
   }

   @Override
   public final IGenericEnumerator<q1> iterator() {
      return this.n5.getValues().iterator();
   }

   public final void k5(int var1) {
      this.n5.removeItemByKey(var1);
   }

   final void n5(com.aspose.slides.internal.z0k.n5 var1, int var2, int var3) {
      boolean var4 = false;

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = var1.r4() & 65535;
         int var7 = var6 & 16383;
         boolean var8 = (var6 & 16384) != 0;
         boolean var9 = (var6 & 32768) != 0;
         long var10 = var1.c4();
         if (var9) {
            var4 = true;
            int var12 = (int)var10;
            switch (var7) {
               case 192:
                  this.n5(new i6(var7, var12));
                  break;
               case 197:
                  this.n5(new y8(var7, var12));
                  break;
               case 325:
               case 326:
               case 337:
               case 338:
               case 341:
               case 342:
               case 343:
               case 407:
               case 463:
               case 899:
               case 928:
               case 1284:
               case 1288:
               case 1359:
               case 1423:
               case 1487:
               case 1551:
                  this.n5(new b2(var7, var12));
                  break;
               case 896:
                  this.n5(new h6(var7, var12));
                  break;
               case 937:
                  this.n5(new r8(var7, var12));
                  break;
               default:
                  this.n5(new v8(var7, var12));
            }
         } else if (!this.n5.containsKey(var7)) {
            switch (var7) {
               case 127:
                  this.n5(new t3(var10));
                  break;
               case 133:
                  this.n5(new f4(var10));
                  break;
               case 191:
                  this.n5(new a8(var10));
                  break;
               case 195:
                  this.n5(new c3(var10));
                  break;
               case 196:
                  this.n5(new l4(var10));
                  break;
               case 255:
                  this.n5(new p6(var10));
                  break;
               case 319:
                  this.n5(new w2(var10));
                  break;
               case 383:
                  this.n5(new f5(var10));
                  break;
               case 385:
                  this.n5(new g7(var10));
                  break;
               case 447:
                  this.n5(new j4(var10));
                  break;
               case 511:
                  this.n5(new a7(var10));
                  break;
               case 575:
                  this.n5(new u4(var10));
                  break;
               case 703:
                  this.n5(new r1(var10));
                  break;
               case 767:
                  this.n5(new h5(var10));
                  break;
               case 831:
                  this.n5(new s9(var10));
                  break;
               case 927:
                  this.n5(new s4(var10));
                  break;
               case 959:
                  this.n5(new d1(var10));
                  break;
               default:
                  this.n5(new z5(var7, var8, var10));
            }
         }
      }

      if (var4) {
         IGenericEnumerator var16 = this.n5.iterator();

         try {
            while (var16.hasNext()) {
               KeyValuePair var17 = (KeyValuePair)var16.next();
               v8 var18 = com.aspose.slides.internal.v6g.k5.n5(var17.getValue(), v8.class);
               if (var18 != null) {
                  var18.n5(var1);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
               var16.dispose();
            }
         }
      }
   }

   final int n5(com.aspose.slides.internal.z0k.l6 var1) {
      int var2 = (int)var1.n5().getPosition();
      IGenericEnumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            q1 var5 = (q1)var4.getValue();
            var5.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IGenericEnumerator var14 = this.n5.iterator();

      try {
         while (var14.hasNext()) {
            KeyValuePair var15 = (KeyValuePair)var14.next();
            v8 var6 = com.aspose.slides.internal.v6g.k5.n5(var15.getValue(), v8.class);
            if (var6 != null) {
               var6.l6(var1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      return (int)var1.n5().getPosition() - var2;
   }

   int k5() {
      int var1 = 0;
      IGenericEnumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            q1 var4 = (q1)var3.getValue();
            var1 += var4.n5();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }
}

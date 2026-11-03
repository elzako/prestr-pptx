package com.aspose.slides.internal.x6s;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o8x.c8;
import com.aspose.slides.internal.o8x.y4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.f0;
import com.aspose.slides.ms.System.Xml.j9;
import com.aspose.slides.ms.System.Xml.v9;
import com.aspose.slides.ms.System.Xml.z7;
import com.aspose.slides.ms.System.Xml.z9;

public class l6 implements n5 {
   private c8[] n5;
   private c8[] l6;
   private c8[] k5;
   private int u3;
   private int a6;
   private int u9;
   private z9 h0;
   private boolean c8;
   private Dictionary<y4, y4> t2;
   private Dictionary<String, y4> s7;

   public l6() {
      this.h0 = new j9();
   }

   public l6(c7 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("reader");
      }

      this.n5(var1, var2);
   }

   public final v9 n5(int var1, String var2) {
      return new com.aspose.slides.internal.o8x.l6(this, null, var2, var1);
   }

   public final void n5(c7 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("reader");
      }

      f0 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, f0.class);
      if (var3 == null || !var3.ag_()) {
         var3 = null;
      }

      this.c8 = var3 != null;
      this.h0 = var1.y1();
      com.aspose.slides.internal.o8x.l6 var4 = new com.aspose.slides.internal.o8x.l6(this, var3, var1.q0(), 0);

      try {
         boolean var5 = var1.h0() == 0;
         int var6 = var1.t4();
         String var7 = this.h0.l6("http://www.w3.org/2000/xmlns/");
         if (var5 && !var1.u9()) {
            return;
         }

         while (var5 || var1.t4() >= var6) {
            switch (var1.s7()) {
               case 0:
               case 2:
               case 6:
               case 9:
               case 11:
               case 12:
               case 16:
               case 17:
               default:
                  break;
               case 1:
                  boolean var13 = var1.m1();
                  var4.u3(var1.e2(), var1.n3(), var1.y4(), var1.q0());

                  while (var1.u3()) {
                     String var9 = var1.y4();
                     if (var9 == var7) {
                        if (var1.e2().length() == 0) {
                           var4.l6(d1.n5, var1.z1());
                        } else {
                           var4.l6(var1.n3(), var1.z1());
                        }
                     } else {
                        var4.u3(var1.e2(), var1.n3(), var9);
                        var4.n5(var1.z1(), 4);
                        var4.l6();
                     }
                  }

                  if (var13) {
                     var4.k5(true);
                  }
                  break;
               case 3:
               case 4:
                  var4.n5(var1.z1(), 4);
                  break;
               case 5:
                  var1.a0();
                  break;
               case 7:
                  var4.h0(var1.n3(), var1.z1(), var1.q0());
                  break;
               case 8:
                  var4.u9(var1.z1());
                  break;
               case 10:
                  z7 var8 = var1.d2();
                  if (var8 != null) {
                     var4.n5(var8);
                  }
                  break;
               case 13:
                  if (var2 == 2 && (!var5 || var1.t4() != 0)) {
                     var4.n5(var1.z1(), 6);
                  }
                  break;
               case 14:
                  if (var1.k7() == 2) {
                     var4.n5(var1.z1(), 5);
                  } else if (var2 == 2 && (!var5 || var1.t4() != 0)) {
                     var4.n5(var1.z1(), 6);
                  }
                  break;
               case 15:
                  var4.k5(false);
            }

            if (!var1.u9()) {
               return;
            }
         }
      } finally {
         var4.a6();
      }
   }

   @Override
   public final a6 createNavigator() {
      return new com.aspose.slides.internal.o8x.h0(this.l6, this.a6, null, 0);
   }

   public final z9 n5() {
      return this.h0;
   }

   public final boolean l6() {
      return this.c8;
   }

   public final int n5(c8[][] var1) {
      var1[0] = this.n5;
      return this.u3;
   }

   public final void n5(c8[] var1, int var2) {
      this.n5 = var1;
      this.u3 = var2;
   }

   public final int l6(c8[][] var1) {
      var1[0] = this.l6;
      return this.a6;
   }

   public final void l6(c8[] var1, int var2) {
      this.l6 = var1;
      this.a6 = var2;
   }

   public final int k5(c8[][] var1) {
      var1[0] = this.k5;
      return this.u9;
   }

   public final void k5(c8[] var1, int var2) {
      this.k5 = var1;
      this.u9 = var2;
   }

   public final void n5(c8[] var1, int var2, c8[] var3, int var4) {
      if (this.t2 == null) {
         this.t2 = new Dictionary<>();
      }

      this.t2.addItem(new y4(var1, var2), new y4(var3, var4));
   }

   public final int n5(c8[] var1, int var2, c8[][] var3) {
      y4 var4 = new y4(var1, var2);
      if (this.t2 != null && this.t2.containsKey(var4.k5())) {
         this.t2.get_Item(var4.k5()).n5(var4);
         var3[0] = var4.n5();
         return var4.l6();
      } else {
         var3[0] = null;
         return 0;
      }
   }

   public final void n5(String var1, c8[] var2, int var3) {
      if (this.s7 == null) {
         this.s7 = new Dictionary<>();
      }

      if (!this.s7.containsKey(var1)) {
         this.s7.addItem(var1, new y4(var2, var3));
      }
   }

   public final int n5(String var1, c8[][] var2) {
      y4 var3 = new y4();
      if (this.s7 != null && this.s7.containsKey(var1)) {
         this.s7.get_Item(var1).n5(var3);
         var2[0] = var3.n5();
         return var3.l6();
      } else {
         var2[0] = null;
         return 0;
      }
   }
}

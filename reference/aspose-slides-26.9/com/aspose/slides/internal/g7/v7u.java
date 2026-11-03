package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public class v7u extends s7k {
   private String n5 = "{0}_{1}";
   private Dictionary<String, List<v7u$n5>> l6 = new Dictionary<>();
   private n3c k5 = null;

   public v7u(d7u var1, u0a var2) {
      super(var1, var2);
      this.n5(0, 3, 4);
      this.n5(0, 4, 12);
      this.n5(1, 0, 4);
      this.n5(3, 1, 4);
   }

   public final void n5(int var1, int var2, int var3) {
      v7u$n5 var4 = new v7u$n5(var1 & 65535, var2 & 65535, var3, this);
      String var5 = this.k5(var1 & 65535, var2 & 65535);
      if (!this.l6.containsKey(var5)) {
         this.l6.set_Item(var5, new List<>());
      }

      this.l6.get_Item(var5).addItem(var4);
   }

   public v7u(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   public final n3c[] n5(int var1, int var2) {
      this.s3();
      String var3 = this.k5(var1, var2);
      if (!this.l6.containsKey(var3)) {
         return new n3c[0];
      }

      v7u$n5[] var4 = (v7u$n5[])this.l6.get_Item(var3).toArray(new v7u$n5[0]);
      List var5 = new List();

      for (v7u$n5 var9 : var4) {
         var5.addItem(var9.u9);
      }

      return (n3c[])var5.toArray(new n3c[0]);
   }

   public final n3c n5() {
      this.s3();
      if (this.k5 != null) {
         return this.k5;
      }

      List var1 = new List();
      boolean var2 = false;
      Dictionary$KeyCollection$Enumerator var3 = this.l6.getKeys().iterator();

      try {
         while (var3.hasNext()) {
            String var4 = (String)var3.next();
            List$Enumerator var5 = this.l6.get_Item(var4).iterator();

            try {
               while (var5.hasNext()) {
                  v7u$n5 var6 = (v7u$n5)var5.next();
                  n3c var7 = var6.u9;
                  switch (var7.u3()) {
                     case 0:
                        switch (var7.a6()) {
                           case 4:
                              var1.insertItem(0, var7);
                              break;
                           default:
                              var1.addItem(var7);
                        }
                     case 1:
                     default:
                        break;
                     case 2:
                        var1.addItem(var7);
                        break;
                     case 3:
                        if ((var7.a6() & 65535) == 0) {
                           var1.insertItem(0, var7);
                           var2 = true;
                        } else if ((var7.a6() & 65535) == 1) {
                           var1.addItem(var7);
                        } else if ((var7.a6() & 65535) == 10) {
                           var1.insertItem(0, var7);
                           var2 = true;
                        } else if ((var7.a6() & 65535) == 4) {
                           var1.addItem(var7);
                        }
                  }

                  if (var2) {
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }

            if (var2) {
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (var1.size() > 0) {
         this.k5 = (n3c)var1.get_Item(0);
      }

      return this.k5;
   }

   public final n3c l6() {
      this.s3();
      if (this.k5 != null) {
         return this.k5;
      }

      boolean var1 = false;
      Dictionary$KeyCollection$Enumerator var2 = this.l6.getKeys().iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            List$Enumerator var4 = this.l6.get_Item(var3).iterator();

            try {
               if (var4.hasNext()) {
                  v7u$n5 var5 = (v7u$n5)var4.next();
                  return var5.u9;
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   @Override
   public void n5(f3c var1) {
      super.n5(var1);
   }

   @Override
   public void l6(f3c var1) {
      super.l6(var1);
      if (!this.a0()) {
         var1.n5(this.d2() & 4294967295L);
         var1.n3();
         int var2 = var1.n3();

         for (int var3 = 0; var3 < (var2 & 65535); var3++) {
            int var4 = var1.n3();
            int var5 = var1.n3();
            long var6 = var1.y4();
            long var8 = var1.n5();
            var1.n5((this.d2() & 4294967295L) + (var6 & 4294967295L) & 4294967295L);
            int var10 = var1.n3();
            if ((var10 & 65535) > 6) {
               var1.n3();
            }

            n3c var11 = null;
            switch (var10) {
               case 0:
                  var11 = new e5a(var4, var5, this);
               case 1:
               case 3:
               case 5:
               case 7:
               case 9:
               case 11:
               default:
                  break;
               case 2:
                  var11 = new f8y(var4, var5, this);
                  break;
               case 4:
                  var11 = new o9b(var4, var5, this);
                  break;
               case 6:
                  var11 = new x4g(var4, var5, this);
                  break;
               case 8:
                  var11 = new j9e(var4, var5, this);
                  break;
               case 10:
                  var11 = new r3q(var4, var5, this);
                  break;
               case 12:
                  var11 = new d4n(var4, var5, this);
            }

            if (var11 != null) {
               var11.n5(var1);
               v7u$n5 var12 = new v7u$n5(var4, var5, var10 & 65535, this);
               var12.u9 = var11;
               String var13 = this.k5(var4, var5);
               if (!this.l6.containsKey(var13)) {
                  this.l6.set_Item(var13, new List<>());
               }

               this.l6.get_Item(var13).addItem(var12);
            }

            var1.n5(var8);
         }
      }
   }

   public final void l6(int var1, int var2) {
      Dictionary$KeyCollection$Enumerator var3 = this.l6.getKeys().iterator();

      try {
         while (var3.hasNext()) {
            String var4 = (String)var3.next();
            List$Enumerator var5 = this.l6.get_Item(var4).iterator();

            try {
               while (var5.hasNext()) {
                  v7u$n5 var6 = (v7u$n5)var5.next();
                  if ((var6.n5 & 65535) == 0 && (var6.l6 & 65535) == 3
                     || (var6.n5 & 65535) == 1 && (var6.l6 & 65535) == 0
                     || (var6.n5 & 65535) == 3 && (var6.l6 & 65535) == 1
                     || (var6.n5 & 65535) == 3 && (var6.l6 & 65535) == 0
                     || (var6.n5 & 65535) == 3 && (var6.l6 & 65535) == 10
                     || (var6.n5 & 65535) == 0 && (var6.l6 & 65535) == 4) {
                     var6.u9.n5(var1, var2);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   @Override
   public void n5(byte[][] var1, long[] var2, long[] var3) {
      if (this.a0()) {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            j2p var5 = new j2p(var4, true);

            try {
               List var6 = new List();
               SortedList var7 = new SortedList();
               Dictionary$KeyCollection$Enumerator var8 = this.l6.getKeys().iterator();

               try {
                  while (var8.hasNext()) {
                     String var9 = (String)var8.next();
                     List$Enumerator var10 = this.l6.get_Item(var9).iterator();

                     try {
                        while (var10.hasNext()) {
                           v7u$n5 var11 = (v7u$n5)var10.next();
                           var7.addItem(var9, var11);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                           var10.dispose();
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }

               IGenericEnumerator var50 = var7.getKeys().iterator();

               try {
                  while (var50.hasNext()) {
                     String var51 = (String)var50.next();
                     var6.addItem(var7.get_Item(var51));
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var50, IDisposable.class)) {
                     var50.dispose();
                  }
               }

               v7u$n5[] var15 = (v7u$n5[])var6.toArray(new v7u$n5[0]);
               var5.n5(0);
               var5.n5(var15.length & 65535);
               int var52 = 0;

               for (int var53 = 0; var53 < var15.length; var53++) {
                  var15[var53].n5();
                  var5.n5(var15[var53].n5);
                  var5.n5(var15[var53].l6);
                  long var16 = 4 + var15.length * 8 + var52 & 4294967295L;
                  var5.k5(var16);
                  var52 += (int)var15[var53].a6;
               }

               for (int var54 = 0; var54 < var15.length; var54++) {
                  var5.n5(var15[var54].u3);
               }

               this.n5(var5, var4, var1, var2, var3);
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } else {
         super.n5(var1, var2, var3);
      }
   }

   private String k5(int var1, int var2) {
      return com.aspose.slides.ms.System.d1.n5(this.n5,new Object[]{ var1, var2});
   }
}

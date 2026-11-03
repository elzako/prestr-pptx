package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class q4d extends s7k {
   private com.aspose.slides.ms.System.i1 l6;
   public final com.aspose.slides.internal.v6g.n5<com.aspose.slides.ms.System.i1> n5 = new q4d$1(this);
   private q4d$u3 k5;
   private Dictionary<Integer, List<q4d$l6>> u3;

   public q4d(d7u var1, u0a var2) {
      super(var1, var2);
      this.k5 = new q4d$u3();
      this.u3 = new Dictionary<>();
   }

   public q4d(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
      this.u3 = new Dictionary<>();
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.d2() & 4294967295L);
      var1.n3();
      int var2 = var1.n3();
      this.k5 = new q4d$u3();
      int var3 = var1.n3();

      for (int var4 = 0; var4 < (var2 & 65535); var4++) {
         q4d$l6 var5 = new q4d$l6(null);
         var5.n5 = var1.n3();
         var5.l6 = var1.n3();
         var5.k5 = var1.n3();
         var5.u3 = var1.n3();
         int var6 = var1.n3() & 65535;
         int var7 = var1.n3() & 65535;
         String var8 = "ISO-8859-1";
         if ((var5.n5 & 65535) == 0) {
            var8 = "utf-16be";
         } else if ((var5.n5 & 65535) == 1) {
            if ((var5.l6 & 65535) == 2) {
               var8 = "big5";
            }
         } else if ((var5.n5 & 65535) == 3) {
            if ((var5.l6 & 65535) == 4) {
               var8 = "big5";
            } else {
               var8 = "utf-16be";
            }
         } else {
            if ((var5.n5 & 65535) != 2) {
               j1.n5(com.aspose.slides.ms.System.d1.n5("could not read names for {0} platform", new Object[]{var5.n5}));
               continue;
            }

            if ((var5.l6 & 65535) == 0) {
               var8 = "us-ascii";
            } else if ((var5.l6 & 65535) == 1) {
               var8 = "ISO-10646-UCS-2";
            } else if ((var5.l6 & 65535) == 2) {
               var8 = "ISO-8859-1";
            }
         }

         long var9 = var1.n5();
         var1.n5(((this.d2() & 4294967295L) + (var3 & 65535) & 4294967295L) + var7 & 4294967295L);
         var5.a6 = var1.n5(var6, var8, true);
         this.n5(var5, true);
         var1.n5(var9);
      }

      super.n5(var1);
   }

   @Override
   public void n5(byte[][] var1, long[] var2, long[] var3) {
      if (this.a0()) {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            j2p var5 = new j2p(var4, true);

            try {
               String var6 = this.l6(4);
               if (var6 == null) {
                  var6 = this.l6(1);
               }

               if (var6 == null) {
                  var6 = com.aspose.slides.ms.System.o0.l6().toString();
               }

               this.l6(1, var6, false);
               this.l6(2, "Regular", false);
               this.l6(3, var6, false);
               this.l6(4, var6, false);
               this.l6(5, "Version 1.1", false);
               this.l6(6, var6, false);
               this.n5(1, var6, false);
               this.n5(2, "Regular", false);
               this.n5(3, var6, false);
               this.n5(4, var6, false);
               this.n5(5, "Version 1.1", false);
               this.n5(6, var6, false);
               int var7 = 0;
               byte var8 = 12;
               byte var9 = 6;
               var5.n5(0);
               var5.n5(this.k5.size() & 65535);
               var5.n5(var8 * this.k5.size() + var9 & 65535);
               IGenericEnumerator var10 = this.k5.getKeys().iterator();

               try {
                  while (var10.hasNext()) {
                     q4d$l6 var11 = (q4d$l6)var10.next();
                     q4d$l6 var12 = (q4d$l6)this.k5.get_Item(var11);
                     var5.n5(var12.n5);
                     var5.n5(var12.l6);
                     var5.n5(var12.k5);
                     var5.n5(var12.u3);
                     if ((var12.n5 & 65535) == 3) {
                        var5.n5(var12.a6.length() * 2 & 65535);
                        var5.n5(var7 & 65535);
                        var7 += var12.a6.length() * 2;
                     } else {
                        var5.n5(var12.a6.length() & 65535);
                        var5.n5(var7 & 65535);
                        var7 += var12.a6.length();
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                     var10.dispose();
                  }
               }

               IGenericEnumerator var37 = this.k5.getKeys().iterator();

               try {
                  while (var37.hasNext()) {
                     q4d$l6 var38 = (q4d$l6)var37.next();
                     q4d$l6 var13 = (q4d$l6)this.k5.get_Item(var38);
                     if ((var13.n5 & 65535) == 3) {
                        var5.n5(var13.a6, "utf-16be");
                     } else if ((var13.n5 & 65535) == 1) {
                        var5.n5(var13.a6, "ASCII");
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var37, IDisposable.class)) {
                     var37.dispose();
                  }
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

   private void n5(int var1, String var2, boolean var3) {
      this.n5(1033, var1, 3, 1, var2, var3);
   }

   private void l6(int var1, String var2, boolean var3) {
      this.n5(0, var1, 1, 0, var2, var3);
   }

   private void n5(int var1, int var2, int var3, int var4, String var5, boolean var6) {
      q4d$l6 var7 = new q4d$l6(null);
      var7.k5 = var1 & 65535;
      var7.u3 = var2 & 65535;
      var7.n5 = var3 & 65535;
      var7.l6 = var4 & 65535;
      var7.a6 = var5;
      this.n5(var7, var6);
   }

   private void n5(q4d$l6 var1, boolean var2) {
      if (this.k5.l6(var1)) {
         if (var2) {
            this.k5.k5(var1);
            this.k5.n5(var1);
         }
      } else {
         this.k5.n5(var1);
      }

      if (!this.u3.containsKey(var1.u3)) {
         this.u3.addItem(var1.u3, new List<>());
      }

      List var3 = this.u3.get_Item(var1.u3);
      int var4 = Integer.MIN_VALUE;

      for (int var5 = 0; var5 < var3.size(); var5++) {
         q4d$l6 var6 = (q4d$l6)var3.get_Item(var5);
         if (var6.n5 == var1.n5 && var6.u3 == var1.u3 && var6.k5 == var1.k5 && var6.l6 == var1.l6) {
            var4 = var5;
            break;
         }
      }

      if (var4 != Integer.MIN_VALUE) {
         var3.removeAt(var4);
      }

      var3.addItem(var1);
   }

   public final p0 n5(int var1) {
      if (!this.u3.containsKey(var1 & 65535)) {
         return null;
      }

      p0 var2 = new p0();
      List var3 = this.u3.get_Item(var1 & 65535);
      List$Enumerator var4 = var3.iterator();

      try {
         while (var4.hasNext()) {
            q4d$l6 var5 = (q4d$l6)var4.next();
            if ((var5.n5 & 65535) == r6.n5().l6()) {
               var2.n5(var5.a6, var5.k5 & 65535);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var2;
   }

   public final void n5(int var1, String var2) {
      this.n5(var1 & 65535, var2, true);
      this.l6(var1 & 65535, var2, true);
      if (this.l6 != null) {
         this.l6.n5(this, new q4d$n5(var1));
      }
   }

   public final String l6(int var1) {
      if (!this.u3.containsKey(var1 & 65535)) {
         return null;
      }

      List var2 = this.u3.get_Item(var1 & 65535);
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            q4d$l6 var4 = (q4d$l6)var3.next();
            if ((var4.n5 & 65535) == r6.n5().l6() && ((var4.k5 & 65535) == 1033 || (var4.k5 & 65535) == 2057)) {
               return var4.a6;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return ((q4d$l6)var2.get_Item(0)).a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.i1 n5(q4d var0, com.aspose.slides.ms.System.i1 var1) {
      return var0.l6 = var1;
   }
}

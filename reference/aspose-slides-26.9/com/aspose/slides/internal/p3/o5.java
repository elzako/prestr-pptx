package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class o5 extends com.aspose.slides.internal.a0.h0 implements com.aspose.slides.internal.a0.m1 {
   private com.aspose.slides.internal.a0.r4 n5;
   private com.aspose.slides.internal.o9b.y1 l6 = new com.aspose.slides.internal.o9b.y1();
   private String k5;
   private String u3;
   private int a6 = -1;
   private String c8 = null;
   private int t2 = -1;
   private boolean s7;
   private com.aspose.slides.internal.a0.c4 x8;
   private List<String> n3 = new List<>();
   private Dictionary<String, List<com.aspose.slides.internal.a0.m1>> y4 = new Dictionary<>();
   private Dictionary<String, List<o5>> e2 = null;
   private Dictionary<String, com.aspose.slides.internal.v4.j5> t9 = null;
   private Dictionary<String, com.aspose.slides.internal.v4.j5> z1 = null;
   private Dictionary<String, com.aspose.slides.internal.v4.j5> t4 = null;
   private Dictionary<String, com.aspose.slides.internal.v4.j5> q0 = null;
   private Dictionary<String, com.aspose.slides.internal.v4.j5> z3 = null;

   public o5() {
   }

   public o5(com.aspose.slides.internal.t1.z8 var1, int var2, String var3, boolean var4, boolean var5) {
      this.k5 = var1.b3();
      this.n5(var1.s3());
      this.l6(var1.f2());
      this.s7 = var4;
      int var6 = var1.o0().u3();
      int var7 = var1.z7().u3();
      this.a6 = var2;
      this.c8 = var3;
      this.l6 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var6, var7);
      this.n5 = new com.aspose.slides.internal.a0.r4(var1);
      this.n5(var5);
   }

   public final void n5(com.aspose.slides.internal.a0.c4 var1) {
      this.x8 = var1;
   }

   public final com.aspose.slides.internal.a0.c4 n5() {
      return this.x8;
   }

   public final com.aspose.slides.internal.o9b.y1 l6() {
      return this.l6;
   }

   public final com.aspose.slides.internal.a0.r4 a6() {
      return this.n5;
   }

   public final String u9() {
      return this.c8;
   }

   public final void n5(int var1) {
      this.t2 = var1;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   public final String h0() {
      if (this.u3 == null) {
         throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"No page key set on the PageViewport: ", this.toString()}));
      } else {
         return this.u3;
      }
   }

   public final void l6(String var1) {
      if (var1 != null) {
         this.n3.addItem(var1);
      }
   }

   public final void n5(String var1, com.aspose.slides.internal.a0.m1 var2) {
      if (this.y4 == null) {
         this.y4 = new Dictionary<>();
      }

      List var3 = null;
      List[] var4 = new List[]{var3};
      boolean var5 = !this.y4.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         var3 = new List();
         this.y4.addItem(var1, var3);
      }

      var3.addItem(var2);
   }

   @Override
   public final boolean k5() {
      return this.y4 == null || this.y4.size() == 0;
   }

   @Override
   public final String[] u3() {
      if (this.y4 == null) {
         return null;
      }

      String[] var1 = new String[this.y4.getKeys().size()];
      int var2 = 0;
      Dictionary$KeyCollection$Enumerator var3 = this.y4.getKeys().iterator();

      try {
         while (var3.hasNext()) {
            String var4 = (String)var3.next();
            var1[var2] = var4;
            var2++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }

   @Override
   public final void n5(String var1, List<o5> var2) {
      if (this.n5 == null) {
         if (this.e2 == null) {
            this.e2 = new Dictionary<>();
         }

         this.e2.addItem(var1, var2);
      } else if (this.y4 != null) {
         List var3 = null;
         List[] var4 = new List[]{var3};
         boolean var5 = this.y4.tryGetValue(var1, var4);
         var3 = var4[0];
         if (var5) {
            List$Enumerator var6 = var3.iterator();

            try {
               while (var6.hasNext()) {
                  com.aspose.slides.internal.a0.m1 var7 = (com.aspose.slides.internal.a0.m1)var6.next();
                  var7.n5(var1, var2);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      }

      if (this.y4 != null && var2 != null) {
         this.y4.removeItemByKey(var1);
         if (this.y4.size() == 0) {
            this.y4 = null;
         }
      }
   }

   public final void n5(Dictionary<String, com.aspose.slides.internal.v4.j5> var1, boolean var2, boolean var3, boolean var4) {
      if (var1 != null) {
         if (var2) {
            if (var3) {
               if (this.t9 == null) {
                  this.t9 = new Dictionary<>();
               }

               if (this.t4 == null) {
                  this.t4 = new Dictionary<>();
               }

               Dictionary$KeyCollection$Enumerator var5 = var1.getKeys().iterator();

               try {
                  while (var5.hasNext()) {
                     String var6 = (String)var5.next();
                     if (!this.t9.containsKey(var6)) {
                        this.t9.addItem(var6, (com.aspose.slides.internal.v4.j5)var1.get_Item(var6));
                     }

                     if (!this.t4.containsKey(var6)) {
                        this.t4.addItem(var6, (com.aspose.slides.internal.v4.j5)var1.get_Item(var6));
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }

               if (this.z1 == null) {
                  this.z1 = new Dictionary<>();
               }

               Dictionary$Enumerator var45 = var1.iterator();

               try {
                  while (var45.hasNext()) {
                     KeyValuePair var7 = (KeyValuePair)var45.next();
                     this.z1.addItem((String)var7.getKey(), (com.aspose.slides.internal.v4.j5)var7.getValue());
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var45, IDisposable.class)) {
                     var45.dispose();
                  }
               }
            } else {
               if (this.t4 == null) {
                  this.t4 = new Dictionary<>();
               }

               Dictionary$KeyCollection$Enumerator var42 = var1.getKeys().iterator();

               try {
                  while (var42.hasNext()) {
                     String var46 = (String)var42.next();
                     if (!this.t4.containsKey(var46)) {
                        this.t4.addItem(var46, (com.aspose.slides.internal.v4.j5)var1.get_Item(var46));
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
                     var42.dispose();
                  }
               }
            }
         } else {
            if (var4) {
               if (this.q0 == null) {
                  this.q0 = new Dictionary<>();
               }

               Dictionary$Enumerator var43 = var1.iterator();

               try {
                  while (var43.hasNext()) {
                     KeyValuePair var47 = (KeyValuePair)var43.next();
                     this.q0.addItem((String)var47.getKey(), (com.aspose.slides.internal.v4.j5)var47.getValue());
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
                     var43.dispose();
                  }
               }
            }

            if (this.z3 == null) {
               this.z3 = new Dictionary<>();
            }

            Dictionary$Enumerator var44 = var1.iterator();

            try {
               while (var44.hasNext()) {
                  KeyValuePair var48 = (KeyValuePair)var44.next();
                  this.z3.addItem((String)var48.getKey(), (com.aspose.slides.internal.v4.j5)var48.getValue());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var44, IDisposable.class)) {
                  var44.dispose();
               }
            }
         }
      }
   }

   public final com.aspose.slides.internal.v4.j5 n5(String var1, int var2) {
      com.aspose.slides.internal.v4.j5 var3 = null;
      String var4 = null;
      switch (var2) {
         case 49:
            if (this.t4 != null) {
               com.aspose.slides.internal.v4.j5[] var15 = new com.aspose.slides.internal.v4.j5[]{var3};
               this.t4.tryGetValue(var1, var15);
               var3 = var15[0];
               var4 = "FIC";
            }
            break;
         case 54:
            if (this.t9 != null) {
               com.aspose.slides.internal.v4.j5[] var13 = new com.aspose.slides.internal.v4.j5[]{var3};
               this.t9.tryGetValue(var1, var13);
               var3 = var13[0];
               var4 = "FSWP";
            }

            if (var3 == null && this.t4 != null) {
               com.aspose.slides.internal.v4.j5[] var14 = new com.aspose.slides.internal.v4.j5[]{var3};
               this.t4.tryGetValue(var1, var14);
               var3 = var14[0];
               var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"FirstAny after ", var4});
            }
            break;
         case 74:
            if (this.q0 != null) {
               com.aspose.slides.internal.v4.j5[] var11 = new com.aspose.slides.internal.v4.j5[]{var3};
               this.q0.tryGetValue(var1, var11);
               var3 = var11[0];
               var4 = "LEWP";
            }

            if (var3 == null && this.z3 != null) {
               com.aspose.slides.internal.v4.j5[] var12 = new com.aspose.slides.internal.v4.j5[]{var3};
               this.z3.tryGetValue(var1, var12);
               var3 = var12[0];
               var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"LastAny after ", var4});
            }
            break;
         case 81:
            if (this.z1 != null) {
               com.aspose.slides.internal.v4.j5[] var5 = new com.aspose.slides.internal.v4.j5[]{var3};
               this.z1.tryGetValue(var1, var5);
               var3 = var5[0];
               var4 = "LSWP";
            }

            if (var3 == null && this.z3 != null) {
               com.aspose.slides.internal.v4.j5[] var10 = new com.aspose.slides.internal.v4.j5[]{var3};
               this.z3.tryGetValue(var1, var10);
               var3 = var10[0];
               var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"LastAny after ", var4});
            }
      }

      return var3;
   }

   @Override
   public final Object clone() {
      o5 var1 = (o5)super.n5(new o5());
      var1.n5 = (com.aspose.slides.internal.a0.r4)this.n5.clone();
      this.l6.a6(var1.l6);
      return var1;
   }

   public final void c8() {
      this.n5 = null;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(64);
      var1.n5("PageViewport: page=");
      var1.n5(this.u9());
      return var1.toString();
   }

   public final boolean t2() {
      return this.s7;
   }

   public final com.aspose.slides.internal.a0.n3 s7() {
      return (com.aspose.slides.internal.a0.n3)this.a6().n5(58).m1();
   }

   public final com.aspose.slides.internal.a0.d5 n5(boolean var1) {
      return this.s7().z8().l6(var1);
   }

   public final com.aspose.slides.internal.a0.d5 x8() {
      return this.s7().z8().k7();
   }

   public final com.aspose.slides.internal.a0.j5 n3() {
      return this.x8().z8();
   }

   public final com.aspose.slides.internal.a0.y2 l6(int var1) {
      return this.a6().n5(var1).m1();
   }

   public final void n5(com.aspose.slides.internal.v8.u3 var1) {
      if (this.n5 != null) {
         this.n5.n5(var1);
      }
   }
}

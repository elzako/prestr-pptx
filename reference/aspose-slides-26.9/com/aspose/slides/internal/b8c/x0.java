package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.IDisposable;

public class x0 implements com.aspose.slides.ms.System.Xml.z7 {
   private Dictionary<com.aspose.slides.ms.System.Xml.k6, t6> n5 = new Dictionary<>();
   private Dictionary<com.aspose.slides.ms.System.Xml.k6, t6> l6 = new Dictionary<>();
   private Dictionary<com.aspose.slides.ms.System.Xml.k6, v6> k5;
   private Dictionary<com.aspose.slides.ms.System.Xml.k6, v6> u3;
   private com.aspose.slides.ms.System.Xml.k6 a6 = com.aspose.slides.ms.System.Xml.k6.n5;
   private String u9 = com.aspose.slides.ms.System.d1.n5;
   private boolean h0 = false;
   private boolean c8 = false;
   private Dictionary<String, Boolean> t2 = new Dictionary<>();
   private Dictionary<com.aspose.slides.ms.System.Xml.k6, h9> s7 = new Dictionary<>();
   private int x8;
   private int n3;
   private Dictionary<com.aspose.slides.ms.System.Xml.k6, t6> y4 = new Dictionary<>();
   private Dictionary<String, i2> e2;

   public x0() {
      this.n3 = 0;
   }

   public final com.aspose.slides.ms.System.Xml.k6 u9() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.a6 = var1;
   }

   @Override
   public final String l6() {
      return this.u9;
   }

   public final void l6(String var1) {
      this.u9 = var1;
   }

   public final Dictionary<com.aspose.slides.ms.System.Xml.k6, t6> h0() {
      return this.n5;
   }

   public final Dictionary<com.aspose.slides.ms.System.Xml.k6, t6> c8() {
      return this.l6;
   }

   public final Dictionary<com.aspose.slides.ms.System.Xml.k6, v6> t2() {
      if (this.k5 == null) {
         this.k5 = new Dictionary<>();
      }

      return this.k5;
   }

   public final Dictionary<com.aspose.slides.ms.System.Xml.k6, v6> s7() {
      if (this.u3 == null) {
         this.u3 = new Dictionary<>();
      }

      return this.u3;
   }

   public final int x8() {
      return this.n3;
   }

   public final void n5(int var1) {
      this.n3 = var1;
   }

   public final Dictionary<String, Boolean> n3() {
      return this.t2;
   }

   public final Dictionary<com.aspose.slides.ms.System.Xml.k6, t6> y4() {
      return this.y4;
   }

   public final Dictionary<com.aspose.slides.ms.System.Xml.k6, h9> e2() {
      return this.s7;
   }

   public final Dictionary<String, i2> t9() {
      if (this.e2 == null) {
         this.e2 = new Dictionary<>();
      }

      return this.e2;
   }

   public final int z1() {
      return this.x8;
   }

   public final void l6(int var1) {
      this.x8 = var1;
   }

   public final t6 l6(com.aspose.slides.ms.System.Xml.k6 var1) {
      t6 var2 = null;
      t6[] var3 = new t6[]{var2};
      boolean var4 = this.n5.tryGetValue(var1, var3);
      var2 = var3[0];
      return var4 ? var2 : null;
   }

   public final t6 k5(com.aspose.slides.ms.System.Xml.k6 var1) {
      t6 var2 = null;
      t6[] var3 = new t6[]{var2};
      boolean var4 = this.y4.tryGetValue(var1, var3);
      var2 = var3[0];
      return var4 ? var2 : null;
   }

   public final v1 u3(com.aspose.slides.ms.System.Xml.k6 var1) {
      t6 var2 = this.l6(var1);
      return var2 != null ? var2.z3() : null;
   }

   public final boolean k5(String var1) {
      return this.t2.containsKey(var1);
   }

   public final boolean u3(String var1) {
      return this.t2.containsKey(var1);
   }

   public final h9 n5(t6 var1, com.aspose.slides.ms.System.Xml.k6 var2) {
      h9 var3 = null;
      if (var1 != null) {
         var3 = var1.l6(var2);
         if (var3 == null) {
            if (!var1.z1().u3() || var2.n5().length() == 0) {
               throw new XmlSchemaException("The '{0}' attribute is not declared.", var2.toString());
            }

            h9[] var4 = new h9[]{var3};
            boolean var5 = !this.s7.tryGetValue(var2, var4) && this.t2.containsKey(var2.n5());
            var3 = var4[0];
            if (var5) {
               throw new XmlSchemaException("The '{0}' attribute is not declared.", var2.toString());
            }
         }
      }

      return var3;
   }

   public final h9 n5(t6 var1, com.aspose.slides.ms.System.Xml.k6 var2, x4 var3, int[] var4) {
      h9 var5 = null;
      var4[0] = 3;
      if (var1 != null) {
         var5 = var1.l6(var2);
         if (var5 != null) {
            var4[0] = 0;
            return var5;
         }

         k9 var6 = var1.t4();
         if (var6 != null) {
            if (!var6.l6().n5(var2)) {
               var4[0] = 6;
            } else if (var6.u9() != 1) {
               h9[] var7 = new h9[]{var5};
               boolean var8 = this.s7.tryGetValue(var2, var7);
               var5 = var7[0];
               if (var8) {
                  if (var5.a0().n3() == 37) {
                     var4[0] = 1;
                  } else {
                     var4[0] = 0;
                  }
               } else if (var6.u9() == 2) {
                  var4[0] = 4;
               }
            } else {
               var4[0] = 5;
            }
         } else if (var1.m3().containsKey(var2)) {
            var4[0] = 7;
         }
      } else if (var3 != null) {
         l2 var9 = com.aspose.slides.internal.v6g.k5.n5(var3, l2.class);
         if (var9 != null) {
            if (var2.equals(var9.n3())) {
               var5 = var9.t9();
               var4[0] = 0;
            } else {
               var4[0] = 8;
            }
         } else {
            var4[0] = 9;
         }
      } else {
         h9[] var10 = new h9[]{var5};
         boolean var11 = this.s7.tryGetValue(var2, var10);
         var5 = var10[0];
         if (var11) {
            var4[0] = 0;
         } else {
            var4[0] = 2;
         }
      }

      return var5;
   }

   public final h9 n5(t6 var1, com.aspose.slides.ms.System.Xml.k6 var2, boolean[] var3) {
      int var4 = 0;
      int[] var5 = new int[]{0};
      h9 var6 = this.n5(var1, var2, null, var5);
      var4 = var5[0];
      switch (var4) {
         case 3:
            throw new XmlSchemaException("The '{0}' attribute is not declared.", var2.toString());
         case 5:
            var3[0] = true;
         case 0:
         case 1:
         case 2:
         case 4:
         default:
            return var6;
         case 6:
         case 7:
            throw new XmlSchemaException("The '{0}' attribute is not allowed.", var2.toString());
      }
   }

   public final void n5(x0 var1, b4 var2) {
      if (this.n3 == 0) {
         this.n3 = var1.x8();
      } else if (this.n3 != var1.x8()) {
         if (var2 != null) {
            var2.n5(this, new i0(new XmlSchemaException("Different Schema types cannot be mixed.", com.aspose.slides.ms.System.d1.n5)));
         }

         return;
      }

      Dictionary$KeyCollection$Enumerator var3 = var1.n3().getKeys().iterator();

      try {
         while (var3.hasNext()) {
            String var4 = (String)var3.next();
            if (!this.t2.containsKey(var4)) {
               this.t2.addItem(var4, true);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      Dictionary$Enumerator var40 = var1.n5.iterator();

      try {
         while (var40.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var40.next();
            if (!this.n5.containsKey((com.aspose.slides.ms.System.Xml.k6)var5.getKey())) {
               this.n5.addItem((com.aspose.slides.ms.System.Xml.k6)var5.getKey(), (t6)var5.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var40, IDisposable.class)) {
            var40.dispose();
         }
      }

      Dictionary$Enumerator var41 = var1.y4.iterator();

      try {
         while (var41.hasNext()) {
            KeyValuePair var6 = (KeyValuePair)var41.next();
            if (!this.y4.containsKey((com.aspose.slides.ms.System.Xml.k6)var6.getKey())) {
               this.y4.addItem((com.aspose.slides.ms.System.Xml.k6)var6.getKey(), (t6)var6.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var41, IDisposable.class)) {
            var41.dispose();
         }
      }

      Dictionary$ValueCollection$Enumerator var42 = var1.e2().getValues().iterator();

      try {
         while (var42.hasNext()) {
            h9 var7 = (h9)var42.next();
            if (!this.s7.containsKey(var7.z8())) {
               this.s7.addItem(var7.z8(), var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
            var42.dispose();
         }
      }

      Dictionary$ValueCollection$Enumerator var43 = var1.t9().getValues().iterator();

      try {
         while (var43.hasNext()) {
            i2 var8 = (i2)var43.next();
            if (!this.t9().containsKey(var8.n5().l6())) {
               this.t9().addItem(var8.n5().l6(), var8);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
            var43.dispose();
         }
      }
   }

   public final void t4() {
      Dictionary var1 = this.n5;

      for (int var2 = 0; var2 < 2; var2++) {
         Dictionary$ValueCollection$Enumerator var3 = var1.getValues().iterator();

         try {
            while (var3.hasNext()) {
               t6 var4 = (t6)var3.next();
               if (var4.c8()) {
                  this.h0 = true;
               }

               if (var4.m1() != null) {
                  this.c8 = true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         var1 = this.l6;
      }
   }

   @Override
   public final boolean k5() {
      return this.c8;
   }

   @Override
   public final boolean u3() {
      return this.h0;
   }

   @Override
   public final com.aspose.slides.ms.System.Xml.e5 n5(String var1, String var2) {
      com.aspose.slides.ms.System.Xml.k6 var3 = new com.aspose.slides.ms.System.Xml.k6(var1, var2);
      Object var4 = null;
      t6[] var5 = new t6[]{(t6)var4};
      boolean var6 = !this.n5.tryGetValue(var3, var5);
      t6 var7 = var5[0];
      if (var6) {
         var5[0] = var7;
         this.l6.tryGetValue(var3, var5);
         var7 = var5[0];
      }

      return var7;
   }

   @Override
   public final IGenericEnumerable<com.aspose.slides.ms.System.Xml.e5> a6() {
      List var1 = new List();
      Dictionary$ValueCollection$Enumerator var2 = this.n5.getValues().iterator();

      try {
         while (var2.hasNext()) {
            t6 var3 = (t6)var2.next();
            var1.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   @Override
   public final com.aspose.slides.ms.System.Xml.o0 n5(String var1) {
      if (this.k5 == null) {
         return null;
      }

      com.aspose.slides.ms.System.Xml.k6 var2 = new com.aspose.slides.ms.System.Xml.k6(var1);
      v6 var3 = null;
      v6[] var4 = new v6[]{var3};
      boolean var5 = this.k5.tryGetValue(var2, var4);
      var3 = var4[0];
      return var5 ? var3 : null;
   }

   @Override
   public final com.aspose.slides.ms.System.Xml.k6 n5() {
      return this.a6;
   }
}

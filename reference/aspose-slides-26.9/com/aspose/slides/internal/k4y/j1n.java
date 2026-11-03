package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class j1n extends b3 {
   private int n5;
   private long l6;
   private List<g7> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "baseType",
      "size",
      "variant",
      "i1",
      "i2",
      "i4",
      "i8",
      "ui1",
      "ui2",
      "ui4",
      "ui8",
      "r4",
      "r8",
      "lpstr",
      "lpwstr",
      "bstr",
      "date",
      "filetime",
      "bool",
      "cy",
      "error",
      "clsid",
      "cf"
   );

   public j1n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      j1n$1 var2 = new j1n$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (u3.n5(var1.n3())) {
                  case 2:
                     a9d var5 = new a9d(var1);
                     this.k5.addItem(new g7("variant", var5));
                     break;
                  case 3:
                     var1.r4();
                     var4 = true;
                     break;
                  case 4:
                     var1.r4();
                     var4 = true;
                     break;
                  case 5:
                     var1.u9();
                     int var6 = com.aspose.slides.ms.System.Xml.f4.e2(var1.z1());
                     this.k5.addItem(new g7("i4", var6));
                     break;
                  case 6:
                     var1.r4();
                     var4 = true;
                     break;
                  case 7:
                     var1.r4();
                     var4 = true;
                     break;
                  case 8:
                     var1.r4();
                     var4 = true;
                     break;
                  case 9:
                     var1.r4();
                     var4 = true;
                     break;
                  case 10:
                     var1.r4();
                     var4 = true;
                     break;
                  case 11:
                     var1.u9();
                     float var7 = (float)e2(var1.z1());
                     this.k5.addItem(new g7("r4", var7));
                     break;
                  case 12:
                     var1.u9();
                     double var8 = e2(var1.z1());
                     this.k5.addItem(new g7("r8", var8));
                     break;
                  case 13:
                     var1.u9();
                     String var10 = var1.z1();
                     this.k5.addItem(new g7("lpstr", var10));
                     break;
                  case 14:
                     var1.u9();
                     String var11 = var1.z1();
                     this.k5.addItem(new g7("lpwstr", var11));
                     break;
                  case 15:
                     var1.r4();
                     var4 = true;
                     break;
                  case 16:
                     var1.r4();
                     var4 = true;
                     break;
                  case 17:
                     var1.u9();
                     com.aspose.slides.ms.System.j5 var12 = com.aspose.slides.ms.System.j5.n5(var1.z1(), com.aspose.slides.internal.x7n.l6.u3(), 16).m3();
                     this.k5.addItem(new g7("filetime", var12.m3()));
                     break;
                  case 18:
                     var1.u9();
                     boolean var13 = com.aspose.slides.ms.System.Xml.f4.t2(var1.z1());
                     this.k5.addItem(new g7("bool", var13));
                     break;
                  case 19:
                     var1.r4();
                     var4 = true;
                     break;
                  case 20:
                     var1.r4();
                     var4 = true;
                     break;
                  case 21:
                     var1.r4();
                     var4 = true;
                     break;
                  case 22:
                     var1.r4();
                     var4 = true;
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            }
         }
      }
   }

   public j1n() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("baseType", d6r.n5(this.n5));
      var2.l6("size", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u3.n5(var5.n5())) {
               case 2:
                  ((a9d)var5.k5()).n5("vt", var2, var5.n5());
               case 3:
               case 4:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
               case 15:
               case 16:
               default:
                  break;
               case 5:
                  this.n5("vt", var2, "i4", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var5.k5(), int.class).intValue()), false);
                  break;
               case 11:
                  this.n5(
                     "vt", var2, "r4", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var5.k5(), float.class).floatValue()), false
                  );
                  break;
               case 12:
                  this.n5(
                     "vt",
                     var2,
                     "r8",
                     com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var5.k5(), double.class).doubleValue()),
                     false
                  );
                  break;
               case 13:
                  this.n5("vt", var2, "lpstr", (String)var5.k5(), false);
                  break;
               case 14:
                  this.n5("vt", var2, "lpwstr", (String)var5.k5(), false);
                  break;
               case 17:
                  this.n5(
                     "vt",
                     var2,
                     "filetime",
                     com.aspose.slides.ms.System.Xml.f4.n5(
                        com.aspose.slides.internal.v6g.k5.u3(var5.k5(), com.aspose.slides.ms.System.j5.class).m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"
                     ),
                     false
                  );
                  break;
               case 18:
                  this.n5(
                     "vt",
                     var2,
                     "bool",
                     com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var5.k5(), boolean.class).booleanValue()),
                     false
                  );
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (u3.n5(var1)) {
         case 2:
            var2 = new g7("variant", new a9d());
            break;
         case 3:
         case 4:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 15:
         case 16:
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
         case 5:
            var2 = new g7("i4", (Integer)com.aspose.slides.internal.v6g.k5.k5(int.class));
            break;
         case 11:
            var2 = new g7("r4", (Float)com.aspose.slides.internal.v6g.k5.k5(float.class));
            break;
         case 12:
            var2 = new g7("r8", (Double)com.aspose.slides.internal.v6g.k5.k5(double.class));
            break;
         case 13:
            var2 = new g7("lpstr", com.aspose.slides.ms.System.d1.n5);
            break;
         case 14:
            var2 = new g7("lpwstr", com.aspose.slides.ms.System.d1.n5);
            break;
         case 17:
            var2 = new g7("filetime", new com.aspose.slides.ms.System.j5());
            break;
         case 18:
            var2 = new g7("bool", (Boolean)com.aspose.slides.internal.v6g.k5.k5(boolean.class));
      }

      this.k5.addItem(var2);
      return var2;
   }

   public final void n5(g7 var1) {
      this.k5.addItem(var1);
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final long n5() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final List<g7> l6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(j1n var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(j1n var0, long var1) {
      return var0.l6 = var1;
   }
}

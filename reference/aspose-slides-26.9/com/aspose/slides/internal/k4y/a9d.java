package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class a9d extends b3 {
   private g7 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "variant",
      "vector",
      "array",
      "blob",
      "oblob",
      "empty",
      "null",
      "i1",
      "i2",
      "i4",
      "i8",
      "int",
      "ui1",
      "ui2",
      "ui4",
      "ui8",
      "uint",
      "r4",
      "r8",
      "decimal",
      "lpstr",
      "lpwstr",
      "bstr",
      "date",
      "filetime",
      "bool",
      "cy",
      "error",
      "stream",
      "ostream",
      "storage",
      "ostorage",
      "vstream",
      "clsid",
      "cf"
   );

   public a9d(com.aspose.slides.ms.System.Xml.c7 var1) {
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (l6.n5(var1.n3())) {
                  case 0:
                     this.n5 = new g7("variant", new a9d(var1));
                     break;
                  case 1:
                     this.n5 = new g7("vector", new j1n(var1));
                     break;
                  case 2:
                     var1.r4();
                     var3 = true;
                     break;
                  case 3:
                     var1.r4();
                     var3 = true;
                     break;
                  case 4:
                     var1.r4();
                     var3 = true;
                     break;
                  case 5:
                     var1.r4();
                     var3 = true;
                     break;
                  case 6:
                     var1.r4();
                     var3 = true;
                     break;
                  case 7:
                     var1.r4();
                     var3 = true;
                     break;
                  case 8:
                     var1.r4();
                     var3 = true;
                     break;
                  case 9:
                     var1.u9();
                     this.n5 = new g7("i4", com.aspose.slides.ms.System.Xml.f4.e2(var1.z1()));
                     break;
                  case 10:
                     var1.r4();
                     var3 = true;
                     break;
                  case 11:
                     var1.r4();
                     var3 = true;
                     break;
                  case 12:
                     var1.r4();
                     var3 = true;
                     break;
                  case 13:
                     var1.r4();
                     var3 = true;
                     break;
                  case 14:
                     var1.r4();
                     var3 = true;
                     break;
                  case 15:
                     var1.r4();
                     var3 = true;
                     break;
                  case 16:
                     var1.r4();
                     var3 = true;
                     break;
                  case 17:
                     var1.u9();
                     this.n5 = new g7("r4", (float)e2(var1.z1()));
                     break;
                  case 18:
                     var1.u9();
                     this.n5 = new g7("r8", e2(var1.z1()));
                     break;
                  case 19:
                     var1.r4();
                     var3 = true;
                     break;
                  case 20:
                     var1.u9();
                     this.n5 = new g7("lpstr", var1.z1());
                     break;
                  case 21:
                     var1.u9();
                     this.n5 = new g7("lpwstr", var1.z1());
                     break;
                  case 22:
                     var1.r4();
                     var3 = true;
                     break;
                  case 23:
                     var1.r4();
                     var3 = true;
                     break;
                  case 24:
                     var1.u9();
                     this.n5 = new g7("filetime", com.aspose.slides.ms.System.j5.n5(var1.z1(), com.aspose.slides.internal.x7n.l6.u3(), 16).m3());
                     break;
                  case 25:
                     var1.r4();
                     var3 = true;
                     break;
                  case 26:
                     var1.r4();
                     var3 = true;
                     break;
                  case 27:
                     var1.r4();
                     var3 = true;
                     break;
                  case 28:
                     var1.r4();
                     var3 = true;
                     break;
                  case 29:
                     var1.r4();
                     var3 = true;
                     break;
                  case 30:
                     var1.r4();
                     var3 = true;
                     break;
                  case 31:
                     var1.r4();
                     var3 = true;
                     break;
                  case 32:
                     var1.r4();
                     var3 = true;
                     break;
                  case 33:
                     var1.r4();
                     var3 = true;
                     break;
                  case 34:
                     var1.r4();
                     var3 = true;
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public a9d() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (l6.n5(this.n5.n5())) {
            case 0:
               ((a9d)this.n5.k5()).n5("vt", var2, this.n5.n5());
               break;
            case 1:
               ((j1n)this.n5.k5()).n5("vt", var2, this.n5.n5());
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
            case 22:
            case 23:
            default:
               break;
            case 9:
               this.n5("vt", var2, "i4", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), int.class).intValue()), false);
               break;
            case 17:
               this.n5(
                  "vt", var2, "r4", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), float.class).floatValue()), false
               );
               break;
            case 18:
               this.n5(
                  "vt",
                  var2,
                  "r8",
                  com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), double.class).doubleValue()),
                  false
               );
               break;
            case 20:
               this.n5("vt", var2, "lpstr", (String)this.n5.k5(), false);
               break;
            case 21:
               this.n5("vt", var2, "lpwstr", (String)this.n5.k5(), false);
               break;
            case 24:
               this.n5(
                  "vt",
                  var2,
                  "filetime",
                  com.aspose.slides.ms.System.Xml.f4.n5(
                     com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), com.aspose.slides.ms.System.j5.class).m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"
                  ),
                  false
               );
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.n5 != null) {
         throw new Exception("Variant already is initialized.");
      }

      switch (l6.n5(var1)) {
         case 0:
            this.n5 = new g7("variant", new a9d());
            break;
         case 1:
            this.n5 = new g7("vector", new j1n());
            break;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 19:
         case 22:
         case 23:
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
         case 9:
            this.n5 = new g7("i4", (Integer)com.aspose.slides.internal.v6g.k5.k5(int.class));
            break;
         case 17:
            this.n5 = new g7("r4", (Float)com.aspose.slides.internal.v6g.k5.k5(float.class));
            break;
         case 18:
            this.n5 = new g7("r8", (Double)com.aspose.slides.internal.v6g.k5.k5(double.class));
            break;
         case 20:
            this.n5 = new g7("lpstr", com.aspose.slides.ms.System.d1.n5);
            break;
         case 21:
            this.n5 = new g7("lpwstr", com.aspose.slides.ms.System.d1.n5);
            break;
         case 24:
            this.n5 = new g7("filetime", new com.aspose.slides.ms.System.j5());
      }

      return this.n5;
   }

   public final g7 n5() {
      return this.n5;
   }
}

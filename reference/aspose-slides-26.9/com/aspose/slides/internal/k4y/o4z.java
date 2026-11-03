package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;
import java.util.Date;

public final class o4z extends b3 {
   private String n5;
   private int l6;
   private String k5;
   private String u3;
   private g7 a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "fmtid",
      "pid",
      "name",
      "linkTarget",
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

   o4z(com.aspose.slides.ms.System.Xml.c7 var1) {
      String var2 = var1.y4();

      while (var1.u3()) {
         if (!"xmlns".equals(var1.e2())) {
            switch (u9.n5(com.aspose.slides.ms.System.d1.a6(var1.n5(var1.e2()), var2) ? var1.n3() : var1.x8())) {
               case 0:
                  this.n5 = var1.z1();
                  break;
               case 1:
                  this.l6 = com.aspose.slides.ms.System.Xml.f4.e2(var1.z1());
                  break;
               case 2:
                  this.k5 = var1.z1();
                  break;
               case 3:
                  this.u3 = var1.z1();
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown attribute \"", var1.x8(), "\""}));
            }
         }
      }

      var1.a6();
      n5(var1, new o4z$1(this, var1));
   }

   o4z() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("fmtid", this.n5);
      var2.l6("pid", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      if (this.k5 != null) {
         var2.l6("name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("linkTarget", this.u3);
      }

      if (this.a6 != null) {
         switch (u9.n5(this.a6.n5())) {
            case 12:
               var2.a6(
                  com.aspose.slides.ms.System.d1.n5(new String[]{"vt:", "i4"}),
                  com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(this.a6.k5(), int.class).intValue())
               );
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 23:
            case 25:
            case 26:
            default:
               break;
            case 20:
               var2.a6(
                  com.aspose.slides.ms.System.d1.n5(new String[]{"vt:", "r4"}),
                  com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(this.a6.k5(), float.class).floatValue())
               );
               break;
            case 21:
               var2.a6(
                  com.aspose.slides.ms.System.d1.n5(new String[]{"vt:", "r8"}),
                  com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(this.a6.k5(), double.class).doubleValue())
               );
               break;
            case 24:
               var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"vt:", "lpwstr"}), (String)this.a6.k5());
               break;
            case 27:
               var2.a6(
                  com.aspose.slides.ms.System.d1.n5(new String[]{"vt:", "filetime"}),
                  com.aspose.slides.ms.System.Xml.f4.n5(
                     com.aspose.slides.internal.v6g.k5.u3(this.a6.k5(), com.aspose.slides.ms.System.j5.class).m3(), "yyyy-MM-ddTHH:mm:ssZ"
                  )
               );
               break;
            case 28:
               var2.a6(
                  com.aspose.slides.ms.System.d1.n5(new String[]{"vt:", "bool"}),
                  com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(this.a6.k5(), boolean.class).booleanValue())
               );
         }
      }

      var2.s7();
   }

   public final g7 n5(Object var1) {
      if (this.a6 != null) {
         throw new Exception("PropertyValue already is initialized.");
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.ms.System.j5.class)) {
         this.a6 = new g7("filetime", var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Date.class)) {
         this.a6 = new g7("filetime", com.aspose.slides.ms.System.j5.n5((Date)var1));
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Boolean.class)) {
         this.a6 = new g7("bool", var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Integer.class)) {
         this.a6 = new g7("i4", var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Float.class)) {
         this.a6 = new g7("r4", var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Double.class)) {
         this.a6 = new g7("r8", var1);
      } else {
         this.a6 = new g7("lpwstr", var1.toString());
      }

      return this.a6;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final String n5() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final g7 l6() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u9;
   }

   // $VF: synthetic method
   static g7 n5(o4z var0, g7 var1) {
      return var0.a6 = var1;
   }
}

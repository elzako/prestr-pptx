package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

public class t6 extends z6 {
   private j8 k5;
   private j8 u3;
   private j8 a6;
   private j8 u9;
   private j8 h0;
   private List<j8> c8;
   private List<j8> t2;
   private List<j8> s7;
   private List<j8> x8;
   private List<j8> n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "application/vnd.ms-office.DrsDownRev+xml",
      "application/vnd.ms-office.DrsShape+xml",
      "application/vnd.ms-office.DrsConnector+xml",
      "application/vnd.ms-office.DrsE2oDoc+xml",
      "application/vnd.ms-office.DrsPicture+xml",
      "application/vnd.ms-office.DrsInk+xml",
      "application/vnd.openxmlformats-officedocument.drawingml.chart+xml",
      "application/vnd.openxmlformats-officedocument.drawingml.diagramColors+xml",
      "application/vnd.openxmlformats-officedocument.drawingml.diagramData+xml",
      "application/vnd.openxmlformats-officedocument.drawingml.diagramLayout+xml",
      "application/vnd.openxmlformats-officedocument.drawingml.diagramStyle+xml",
      "application/vnd.ms-office.drawingml.diagramDrawing+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.slideMaster+xml",
      "application/vnd.openxmlformats-officedocument.theme+xml",
      "application/vnd.openxmlformats-officedocument.themeOverride+xml",
      "application/vnd.openxmlformats-officedocument.themeManager+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.tableStyles+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.slideLayout+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.timingInfo+xml",
      "application/inkml+xml",
      "application/vnd.ms-office.inkAction+xml"
   );

   public t6(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.b8.s7 var2) {
      this.n5(var1, var2);
      if (this.c8 == null) {
         this.c8 = new List<>();
      }

      if (this.x8 == null) {
         this.x8 = new List<>();
      }

      if (this.n3 == null) {
         this.n3 = new List<>();
      }

      if (this.t2 == null) {
         this.t2 = new List<>();
      }

      if (this.s7 == null) {
         this.s7 = new List<>();
      }
   }

   public t6() {
      this.x8();
      if (this.c8 == null) {
         this.c8 = new List<>();
      }

      if (this.x8 == null) {
         this.x8 = new List<>();
      }

      if (this.n3 == null) {
         this.n3 = new List<>();
      }

      if (this.t2 == null) {
         this.t2 = new List<>();
      }

      if (this.s7 == null) {
         this.s7 = new List<>();
      }
   }

   public final j8 y4() {
      return this.k5;
   }

   public final List<j8> e2() {
      return this.c8;
   }

   public final j8 t9() {
      return this.u3;
   }

   public final j8 z1() {
      return this.a6;
   }

   public final j8 t4() {
      return this.u9;
   }

   public final List<j8> q0() {
      return this.x8;
   }

   public final List<j8> z3() {
      return this.n3;
   }

   public final j8 m1() {
      return this.h0;
   }

   @Override
   public void n5(IGenericList<j8> var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            j8 var3 = (j8)var2.next();
            this.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public void n5(j8 var1) {
      if (this.c8 == null) {
         this.c8 = new List<>();
      }

      if (this.x8 == null) {
         this.x8 = new List<>();
      }

      if (this.n3 == null) {
         this.n3 = new List<>();
      }

      if (this.t2 == null) {
         this.t2 = new List<>();
      }

      if (this.s7 == null) {
         this.s7 = new List<>();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1.y4(), r4.class)) {
         switch (y4.n5(var1.y4().n5())) {
            case 0:
               this.k5 = var1;
               break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
               this.c8.addItem(var1);
               break;
            case 6:
               this.t2.addItem(var1);
               break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
               this.s7.addItem(var1);
               break;
            case 12:
               this.u3 = var1;
               break;
            case 13:
               this.x8.addItem(var1);
               break;
            case 14:
               this.x8.addItem(var1);
               break;
            case 15:
               this.a6 = var1;
               break;
            case 16:
               this.u9 = var1;
               break;
            case 17:
               this.n3.addItem(var1);
               break;
            case 18:
               this.h0 = var1;
            case 19:
            case 20:
               break;
            default:
               throw new NotImplementedException(
                  com.aspose.slides.ms.System.d1.n5(new String[]{"We haven't processing for the part entry with type = ", var1.y4().toString()})
               );
         }
      } else if (var1.y4() == null) {
         var1.l6(new n8());
      }
   }

   public final byte[] k7() {
      com.aspose.slides.internal.e5a.d2 var1 = new com.aspose.slides.internal.e5a.d2();
      this.n5(var1);
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();
      var1.l6(var2);
      return var2.toArray();
   }
}

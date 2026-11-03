package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class d9 extends z6 {
   private j8 k5;
   private j8 u3;
   private List<j8> a6;
   private List<j8> u9;
   private List<j8> h0;
   private List<j8> c8;
   private List<j8> t2;
   private List<j8> s7;
   private List<j8> x8;
   private List<j8> n3;
   private List<j8> y4;
   private List<j8> e2;
   private j8 t9;
   private j8 z1;
   private j8 t4;
   private j8 q0;
   private j8 z3;
   private j8 m1;
   private j8 k7;
   private j8 m3;
   private j8 z8;
   private j8 j5;
   private static final com.aspose.slides.internal.v6g.u9 w1 = new com.aspose.slides.internal.v6g.u9(
      "application/vnd.openxmlformats-officedocument.presentationml.slideMaster+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.slideLayout+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.notesSlide+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.notesMaster+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.handoutMaster+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.slide+xml",
      "application/vnd.openxmlformats-officedocument.vmlDrawing",
      "application/vnd.openxmlformats-officedocument.presentationml.tags+xml",
      "application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml",
      "application/vnd.openxmlformats-officedocument.extended-properties+xml",
      "application/vnd.openxmlformats-package.core-properties+xml",
      "application/vnd.openxmlformats-officedocument.custom-properties+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.presProps+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.viewProps+xml",
      "application/vnd.openxmlformats-officedocument.theme+xml",
      "application/vnd.ms-office.classificationlabels+xml"
   );

   public final j8[] y4() {
      return this.a6.toArray(new j8[0]);
   }

   public final j8[] e2() {
      return this.u9.toArray(new j8[0]);
   }

   public final j8[] t9() {
      return this.h0.toArray(new j8[0]);
   }

   public final j8[] z1() {
      return this.c8.toArray(new j8[0]);
   }

   public final j8[] t4() {
      return this.t2.toArray(new j8[0]);
   }

   public final j8[] q0() {
      return this.s7.toArray(new j8[0]);
   }

   public final j8[] z3() {
      return this.x8.toArray(new j8[0]);
   }

   public final j8[] m1() {
      return this.e2.toArray(new j8[0]);
   }

   public final j8 k7() {
      return this.t4;
   }

   public final j8 m3() {
      return this.z1;
   }

   public final j8 z8() {
      return this.t9;
   }

   public final j8 j5() {
      return this.k5;
   }

   private void a6(j8 var1) {
      this.k5 = var1;
   }

   public final j8 w1() {
      return this.m1;
   }

   public final j8 r4() {
      return this.k7;
   }

   public final j8 c4() {
      return this.m3;
   }

   public final j8 y2() {
      return this.z8;
   }

   public final j8 y1() {
      return this.j5;
   }

   public final j8 a0() {
      return this.q0;
   }

   public final j8 d2() {
      return this.z3;
   }

   public final j8 d5() {
      return this.u3;
   }

   public final void u3(j8 var1) {
      this.u3 = var1;
   }

   public d9() {
      this.x8();
   }

   public d9(com.aspose.slides.internal.z0k.t4 var1, boolean var2, com.aspose.slides.internal.b8.s7 var3) {
      this.l6(var1, var2, var3);
   }

   public d9(com.aspose.slides.internal.l2.k5 var1, com.aspose.slides.internal.b8.s7 var2) {
      this.n5(var1, var2);
   }

   public d9(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.b8.s7 var2) {
      this.n5(var1, var2);
   }

   @Override
   public void n5(IGenericList<j8> var1) {
      if (this.x8 == null) {
         this.x8 = new List<>();
      }

      if (this.a6 == null) {
         this.a6 = new List<>();
      }

      if (this.u9 == null) {
         this.u9 = new List<>();
      }

      if (this.h0 == null) {
         this.h0 = new List<>();
      }

      if (this.c8 == null) {
         this.c8 = new List<>();
      }

      if (this.t2 == null) {
         this.t2 = new List<>();
      }

      if (this.s7 == null) {
         this.s7 = new List<>();
      }

      if (this.n3 == null) {
         this.n3 = new List<>();
      }

      if (this.y4 == null) {
         this.y4 = new List<>();
      }

      if (this.e2 == null) {
         this.e2 = new List<>();
      }

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

      if (this.m1 == null) {
         throw new t5("Can't find presentation part.");
      }

      r7[] var7 = this.m1.e2().n5(i8.n5);
      if (var7.length > 0) {
         this.k7 = this.u9(var7[0].n5());
      } else {
         this.k7 = this.u9("/ppt/tableStyles.xml");
      }

      var7 = this.m1.e2().n5(j1.n5);
      if (var7.length > 0) {
         j8 var4 = this.u9(var7[0].n5());
         if (var4 != null) {
            this.m3 = this.u9(var7[0].n5());
         }
      }

      var7 = this.c8().n5(v9.n5);
      if (var7.length > 0) {
         this.u3(this.u9(var7[0].n5()));
         if (this.d5() != null) {
            this.d5().n5(true);
         }
      }
   }

   @Override
   public void n5(j8 var1) {
      if (this.x8 == null) {
         this.x8 = new List<>();
      }

      if (this.a6 == null) {
         this.a6 = new List<>();
      }

      if (this.u9 == null) {
         this.u9 = new List<>();
      }

      if (this.h0 == null) {
         this.h0 = new List<>();
      }

      if (this.c8 == null) {
         this.c8 = new List<>();
      }

      if (this.t2 == null) {
         this.t2 = new List<>();
      }

      if (this.s7 == null) {
         this.s7 = new List<>();
      }

      if (this.n3 == null) {
         this.n3 = new List<>();
      }

      if (this.y4 == null) {
         this.y4 = new List<>();
      }

      if (this.e2 == null) {
         this.e2 = new List<>();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1.y4(), r4.class)) {
         switch (w1.n5(var1.y4().n5())) {
            case 0:
               this.h0.addItem(var1);
               break;
            case 1:
               this.u9.addItem(var1);
               break;
            case 2:
               this.c8.addItem(var1);
               break;
            case 3:
               this.t2.addItem(var1);
               break;
            case 4:
               this.s7.addItem(var1);
               break;
            case 5:
               this.a6.addItem(var1);
               break;
            case 6:
               this.n3.addItem(var1);
               break;
            case 7:
               this.y4.addItem(var1);
               break;
            case 8:
               this.e2.addItem(var1);
               break;
            case 9:
               if (this.t9 == null) {
                  this.t9 = var1;
               } else {
                  var1.n5(true);
               }
               break;
            case 10:
               if (this.z1 == null) {
                  this.z1 = var1;
               } else {
                  var1.n5(true);
               }
               break;
            case 11:
               this.t4 = var1;
               break;
            case 12:
               this.q0 = var1;
               break;
            case 13:
               this.z3 = var1;
               break;
            case 14:
               if (this.m3 == null) {
                  this.m3 = var1;
               }
               break;
            case 15:
               this.a6(var1);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1.y4(), r6.class)) {
            this.m1 = var1;
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1.y4(), y8.class)) {
         this.x8.addItem(var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1.y4(), t0.class)) {
         this.z8 = var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1.y4(), n6.class)) {
         this.j5 = var1;
      } else if (var1.y4() == null) {
         var1.l6(new n8());
      }
   }
}

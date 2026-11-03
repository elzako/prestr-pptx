package com.aspose.slides.internal.k4y;

class s1q$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s1q l6;

   s1q$2(s1q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s1q.t2().n5(this.n5.n3())) {
         case 2:
            s1q.n5(this.l6, new q8e(this.n5));
            break;
         case 3:
            s1q.n5(this.l6, new g7("audioCd", new e1(this.n5)));
            break;
         case 4:
            s1q.n5(this.l6, new g7("wavAudioFile", new x7n(this.n5)));
            break;
         case 5:
            s1q.n5(this.l6, new g7("audioFile", new g0(this.n5)));
            break;
         case 6:
            s1q.n5(this.l6, new g7("videoFile", new z8m(this.n5)));
            break;
         case 7:
            s1q.n5(this.l6, new g7("quickTimeFile", new m4d(this.n5)));
            break;
         case 8:
            s1q.n5(this.l6, new r9o(this.n5));
            break;
         case 9:
            s1q.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}

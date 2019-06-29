package client.com.canvas_beizer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class PathView extends View {
    private Paint mPaint;
    private Path mPath;
    public PathView(Context context) {
        this(context,null);
    }

    public PathView(Context context,  AttributeSet attrs) {
        this(context, attrs,0);
    }

    public PathView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        mPaint=new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(4);
        mPath=new Path();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        mPath.moveTo(100,70);//移动
////        mPath.lineTo(140,800);//连线
//        //相对于path当前点的位置，等同于上一行代码的效果。
//        mPath.rLineTo(70,730);
//        mPath.lineTo(250,600);
//        mPath.close();
//        canvas.drawPath(mPath,mPaint);

//        //添加子图形addxxx
//        //添加弧形 ,从-255度起顺时针方向扫过255度画弧
//        mPath.addArc(200,200,400,400,-255,255);
//        //添加一个矩形
//        //Path.Direction.CW 表示顺时针方向绘制，Path.Direction.CCW表示逆时针方向绘制
//        mPath.addRect(500,500,900,900,Path.Direction.CW);
//        //添加一个圆
//        mPath.addCircle(700,700,200,Path.Direction.CW);
//        //添加一个椭圆
//        mPath.addOval(0,0,500,300,Path.Direction.CW);
//        mPaint.setColor(Color.GRAY);
//        canvas.drawRect(400,200,600,400,mPaint);
//        mPaint.setColor(Color.RED);
//        mPath.addArc(200,200,400,400,-255,255);
//        //追加图形
//        //xxTo画线
//        mPath.arcTo(400,200,600,400,-180,225,false);

//        mPath.moveTo(0,0);
//        mPath.lineTo(100,100);
//        mPath.arcTo(400,200,600,400,0,270,false);

        //添加一个路径
//        mPath.moveTo(100,70);
//        mPath.lineTo(140,180);
//        mPath.lineTo(250,330);
//        mPath.lineTo(400,630);
//        mPath.lineTo(100,830);
//
//        Path newPath=new Path();
//        newPath.moveTo(100,1000);
//        newPath.lineTo(600,1300);
//        newPath.lineTo(400,1700);
//        mPath.addPath(newPath);

//        RectF rectF=new RectF(200,800,700,1200);
//        //添加圆角矩形，CW顺时针 CCW逆时针
//        mPath.addRoundRect(rectF,20,20,Path.Direction.CW);

        //画二阶贝塞尔曲线
//        mPath.moveTo(300,500);
//        mPath.quadTo(500,100,800,500);
        //参数表示相对位置，等同于上面一行代码
//        mPath.rQuadTo(200,-400,500,0);


        //画三阶贝塞尔曲线
         mPath.moveTo(300,500);
        mPath.cubicTo(500,100,600,1200,800,500);
        canvas.drawPath(mPath,mPaint);
    }
}

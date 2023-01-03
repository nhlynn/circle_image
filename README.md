To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.nhlynn:circle_image:1.0.0'
	}

Usage

1. Add CircleIamgeView to your layout

        <com.nhlynn.circleimage.MaterialCircleImageView
        android:id="@+id/iv_nhlynn"
        android:layout_width="200dp"
        android:layout_height="200dp"
        app:highlightColor="#806200EE"
        app:srcCompat="@drawable/img"
        app:strokeColor="#6200EE"
        app:strokeWidth="2dp" />
      

2. Fetch and modify your CircleIamgeView in your layout class
 
        binding.ivNhlynn.setHighlightColor(Color.parseColor("#806200EE"))
        binding.ivNhlynn.setHighlightEnable(true) // true or false
        binding.ivNhlynn.setStrokeColor(ContextCompat.getColor(this,R.color.purple_500))
        binding.ivNhlynn.setStrokeWidth(2f)
        
       
![image](https://user-images.githubusercontent.com/57884748/210323199-8152acb6-fd1e-4383-9579-a21e39504886.png)
